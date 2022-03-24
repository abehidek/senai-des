package b_swing.desafios;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
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
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        conta = engine.eval(calculo).toString();
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
}
