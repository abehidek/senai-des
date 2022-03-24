package b_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Eventos02 extends JFrame{

    JTextField login;
    JPasswordField senha;
    JButton ok, cancel;
    
    public Eventos02(){
        super("Login - Orkut 2.0");

        login = new JTextField();
        senha = new JPasswordField();
        ok = new JButton("Ok");
        ok.addActionListener(new BotaoOkListener());
        cancel = new JButton("Cancelar");
        cancel.addActionListener(new BotaoCancelListener());

        Container c = getContentPane();
        c.setLayout(new GridLayout(3,2));
        c.add(new JLabel("Login:"));
        c.add(login);
        c.add(new JLabel("Senha: "));
        c.add(senha);
        c.add(ok);
        c.add(cancel);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Eventos02();
    }

    class BotaoOkListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String s = "Login: " +login.getText()+"\nSenha: "+new String(senha.getPassword());
            JOptionPane.showMessageDialog(null, s);
        }
    }
    class BotaoCancelListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            login.setText("");
            senha.setText("");
            JOptionPane.showMessageDialog(null, "Dados limpos com Sucesso!");
        }
    }
}
