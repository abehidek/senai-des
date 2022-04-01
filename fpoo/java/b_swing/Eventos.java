package b_swing;

import java.awt.event.*;
import javax.swing.*;

public class Eventos extends JFrame implements ActionListener{
    JButton ok;
    public Eventos(){
        super("Eventos");
        ok = new JButton("Clique aqui");
        ok.addActionListener(this);
        getContentPane().add(ok);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Eventos();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        System.out.printf("Cliquei!");
        if (e.getSource() == ok) {
            new Eventos02();
            this.dispose();
        }
    }
}
