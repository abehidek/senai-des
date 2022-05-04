import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CalculadoraModelo2 extends  JFrame implements ActionListener {
    public static void main(String[] args) {
        new CalculadoraModelo2();

    }

    //TODO Pensar o que implementar nos botões vazios
    String[] botoes = new String[]{"C", "", "", "","7", "8", "9", "*", "4", "5", "6", "-", "1", "2", "3", "+", "0", ".", "=", "/"};
    JTextField display;
    String valorTxt;
    String armazenarTxt = "";
    ArrayList<Double> listaNumeros;
    ArrayList<Character> listaCaracteres;
    double resultado;
    public static final Font BTN_FONT = new Font(Font.SANS_SERIF, Font.BOLD, 24);

    public CalculadoraModelo2(){
        super("Calculadora v2");

        //instanciamos o JTextField
        display = new JTextField(10);

        //desabilitamos para que o usuario não consiga digitar nele
        display.setEditable(false);
        display.setPreferredSize(new Dimension(200, 50));
        display.setFont(BTN_FONT);

        //instanciamos as listas
        listaNumeros = new ArrayList<Double>();
        listaCaracteres = new ArrayList<Character>();

        //atribuímos vazio  para a string
        valorTxt = "";

        //criamos um JPanel
        Container n = new JPanel();

        //definimos o tipo de layout
        n.setLayout(new GridLayout(5,4));

        //obtemos o tamanho do array botoes
        var botoesCalculadora = new JButton[botoes.length];

        //criamos um laço de repetição, de modo que o tamanho dele será o da quantidade de botões que precisamos
        //ou seja, será o tamanho do nosso array botoes
        for(var i = 0; i < botoesCalculadora.length; i++) {

            //cada vez que entrar nesse laço, nós criaremos um novo JButton
            botoesCalculadora[i] = new JButton(botoes[i].toString());
            botoesCalculadora[i].setPreferredSize(new java.awt.Dimension(100, 50));
            botoesCalculadora[i].setFont(BTN_FONT);

            //poderíamos adicionar o actionlistener padrão e fazer um override
            //botoesCalculadora[i].addActionListener(this);

            //adicionamos o actionlistener
            botoesCalculadora[i].addActionListener(new ActionListener()
            {
                //nos utilizamos do actionPerformed para chamar a nossa função
                public void actionPerformed(java.awt.event.ActionEvent evt)
                {
                    botaoCalculadoraPressionado(evt);
                }
            });

            n.add(botoesCalculadora[i]);
        }

        Container c = getContentPane();

        c.add(BorderLayout.NORTH, display);
        c.add(BorderLayout.CENTER, n);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

    private void botaoCalculadoraPressionado(ActionEvent e) {
        String textoBotao = e.getActionCommand();
        String valorBotao = ((JButton) e.getSource()).getText();
        System.out.println("numero" + textoBotao);
        System.out.println("numero" + valorBotao);

        if(textoBotao == ""){
            JOptionPane.showMessageDialog(null, "Botão sem funcionalidade", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        if (testarNumero(textoBotao)){
            System.out.println("Valortxt = " + valorTxt);
            if(armazenarTxt == ""){
                System.out.println("valor igual a zero");
                valorTxt = textoBotao;
            }
            else{
                valorTxt += textoBotao;
            }

            System.out.println("numero" + textoBotao);
            display.setText(valorTxt);
            armazenarTxt += valorBotao;
            //resultado = Double.parseDouble(valorBotao);
        }
        else{
            System.out.println("operador" + textoBotao);
            System.out.println(armazenarTxt);

            //caso não seja um "." ou "C", nós aplicamos a lógica de um operador
            if(textoBotao != "." && textoBotao != "C"){
                //adicionamos o conteúdo anterior ao operador na nossa lista de números
                listaNumeros.add(Double.parseDouble(armazenarTxt));
                //inserimos esse novo operador na lista de caracteres
                listaCaracteres.add(textoBotao.charAt(0));
                //resetamos a variável que armazena os números antes de serem inseridos na listaNumeros
                armazenarTxt = "";
            }
            else{
                if(textoBotao == "."){
                    //verificamos se a variável já possui um "."
                    if(!armazenarTxt.contains(".")){
                        System.out.println("não possui .");
                        //caso não possua, adicionamos o "."
                        armazenarTxt += valorBotao;
                    }
                }
            }

            if(textoBotao == "C"){
                limparDados();
            }
            else{
                //obter o último registro
                var lastChar = valorTxt.charAt(valorTxt.length() -1);
                System.out.println(lastChar);
                var validarChar = new char[]{'-', '+', '/' , '*', '.', '='};

                //verificamos a existência do caracter especial na última posição da variável
                if((new String(validarChar).indexOf(lastChar) == -1)){
                    //não existe o caracter especial, então adicionamos esse valor no display
                    valorTxt += textoBotao;
                    display.setText(valorTxt);

                    //identificamos se o botão clicado foi o de igual
                    if(textoBotao == "="){
                        //consultamos o método calcular
                        resultado = calcular();
                        //zeramos as listas
                        listaNumeros.removeAll(listaNumeros);
                        listaCaracteres.removeAll(listaCaracteres);

                        armazenarTxt = String.valueOf(resultado);
                        valorTxt = armazenarTxt;
                        display.setText(armazenarTxt);

                        if(armazenarTxt.equals("0.0")){
                            armazenarTxt = "";
                        }
                    }
                }
            }
        }
    }

    public boolean testarNumero(String numero){
        try{
            double numeroReal = Double.parseDouble(numero);
            return true;
        }
        catch (NumberFormatException exp){
            return false;
        }
    }
    public void limparDados(){
        if(listaNumeros.size() > 0){
            listaNumeros.removeAll(listaNumeros);
        }

        if(listaCaracteres.size() > 0){
            listaCaracteres.removeAll(listaCaracteres);
        }

        armazenarTxt = "";
        valorTxt = "";
        display.setText("");
    }

    public double calcular(){
        System.out.println("Calcular");
        System.out.println(listaNumeros.size());
        System.out.println(listaNumeros);
        double numero1, numero2;
        double subTotal = 0;
        char operador;

        for (int i = 0; i < listaNumeros.size() - 1; i++) {
            if(subTotal == 0){
                numero1 = listaNumeros.get(i);
                numero2 = listaNumeros.get(i + 1);
                operador = listaCaracteres.get(i);
                subTotal = fazerCalculo(numero1, numero2, operador);
            }
            else{
                numero1 = subTotal;
                numero2 = listaNumeros.get(i + 1);
                operador = listaCaracteres.get(i);
                subTotal = fazerCalculo(numero1, numero2, operador);
            }

            System.out.println("Valor 1: " + numero1 + " Valor 2: " + numero2
                    + "Operador: " + operador );
        }

        return subTotal;
    }

    public double fazerCalculo(double num1, double num2, char op){
        resultado = 0.00;

        if (op == '+'){
            resultado = num1 + num2;
        }
        else if (op == '-'){
            resultado = num1 - num2;
        }
        else if (op == '*'){
            resultado = num1 * num2;
        }
        else if (op == '/'){
            resultado = num1 / num2;
        }
        else{

        }

        return resultado;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String textoBotao = e.getActionCommand();
        System.out.println("numero" + textoBotao);
    }
}
