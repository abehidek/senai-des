package b_swing.desafios;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.script.ScriptException;


public class Calculadora extends JFrame implements ActionListener {
    String conta = "0";
    JTextField field;
    public static void main(String[] args) {
        new Calculadora();
    }
    public Calculadora() {
        super("Calculadora");
        Container c = new JPanel();
        c.setLayout(new GridLayout(4,4,3,3));

        String [] op = {"7","8","9","/","4","5","6","*","1","2","3","-",".","0","=","+"};
        JButton [] buttons = new JButton [16];
        for (int i = 0; i < 16; i++) {
            buttons[i] = new JButton(op[i]);
            buttons[i].addActionListener(this);
            c.add(buttons[i]);
        }

        JButton reset = new JButton("AC");
        reset.addActionListener(this);        
        field = new JTextField();
        field.setEditable(false);
        Font font = new Font("Courier", Font.BOLD,18);
        field.setFont(font);
        field.setSize(500, 100);
        field.setText("0");
        
        Container painel = getContentPane();
        painel.setLayout(new BorderLayout());
        painel.setSize(400, 400);

        painel.add(field, "North");
        field.setPreferredSize(new Dimension(400, 100));
        painel.add(c, "Center");
        painel.add(reset, "South");
        reset.setPreferredSize(new Dimension(400, 50));
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setResizable(false);
        setVisible(true);
    }
    public void calcular (String calculo) throws ScriptException {
        // ScriptEngineManager mgr = new ScriptEngineManager();
        // ScriptEngine engine = mgr.getEngineByName("JavaScript");
        // conta = engine.eval(calculo).toString();
        conta = Double.toString(eval(calculo));
        field.setText(conta);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String textoBotao = e.getActionCommand(); // String textoBotao2 = ((JButton) e.getSource()).getText(); Usando Cast em Java
        String[] operadores = {"/","*","-","+"};
        if (!textoBotao.equals("=")) {
            if (Arrays.asList(operadores).contains(textoBotao) && Arrays.asList(operadores).contains(conta.substring(conta.length() - 1)))
                System.out.println("Operador ja digitado!!");
            else {
                if (textoBotao.equals("AC"))
                    conta = "0";
                else
                    if (conta.startsWith("0")) 
                        conta = textoBotao; 
                    else
                        conta += textoBotao;
                field.setText(conta);
            }   
        }
        else {
            try {
                calcular(conta);
            } catch (ScriptException e1) {
                e1.printStackTrace();
            }
        }
    }
    // https://stackoverflow.com/questions/3422673/how-to-evaluate-a-math-expression-given-in-string-form
    public double eval(final String str) {
        try {
            return new Object() {
                int pos = -1, ch;
                
                void nextChar() {
                    ch = (++pos < str.length()) ? str.charAt(pos) : -1;
                }
                
                boolean eat(int charToEat) {
                    while (ch == ' ') nextChar();
                    if (ch == charToEat) {
                        nextChar();
                        return true;
                    }
                    return false;
                }
                
                double parse() {
                    nextChar();
                    double x = parseExpression();
                    if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                    return x;
                }
                
                // Grammar:
                // expression = term | expression `+` term | expression `-` term
                // term = factor | term `*` factor | term `/` factor
                // factor = `+` factor | `-` factor | `(` expression `)` | number
                //        | functionName `(` expression `)` | functionName factor
                //        | factor `^` factor
                
                double parseExpression() {
                    double x = parseTerm();
                    for (;;) {
                        if      (eat('+')) x += parseTerm(); // addition
                        else if (eat('-')) x -= parseTerm(); // subtraction
                        else return x;
                    }
                }
                
                double parseTerm() {
                    double x = parseFactor();
                    for (;;) {
                        if      (eat('*')) x *= parseFactor(); // multiplication
                        else if (eat('/')) x /= parseFactor(); // division
                        else return x;
                    }
                }
                
                double parseFactor() {
                    if (eat('+')) return +parseFactor(); // unary plus
                    if (eat('-')) return -parseFactor(); // unary minus
                    
                    double x;
                    int startPos = this.pos;
                    if (eat('(')) { // parentheses
                        x = parseExpression();
                        if (!eat(')')) throw new RuntimeException("Missing ')'");
                    } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                        while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                        x = Double.parseDouble(str.substring(startPos, this.pos));
                    } else if (ch >= 'a' && ch <= 'z') { // functions
                        while (ch >= 'a' && ch <= 'z') nextChar();
                        String func = str.substring(startPos, this.pos);
                        if (eat('(')) {
                            x = parseExpression();
                            if (!eat(')')) throw new RuntimeException("Missing ')' after argument to " + func);
                        } else {
                            x = parseFactor();
                        }
                        if (func.equals("sqrt")) x = Math.sqrt(x);
                        else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                        else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                        else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                        else throw new RuntimeException("Unknown function: " + func);
                    } else {
                        throw new RuntimeException("Unexpected: " + (char)ch);
                    }
                    
                    if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation
                    
                    return x;
                }
            }.parse();    
        } catch (Exception e) {
            System.out.println("Deu Erro");
        }
        return 0;
    }
}
