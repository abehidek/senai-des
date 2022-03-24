package b_swing;

import java.awt.*;
import javax.swing.*;

public class janela01 extends JFrame {
    
    public janela01(){
        super("aaaaaaa");

        Container c = getContentPane();
        c.setLayout(new GridLayout(2, 3));
        c.add(new JButton("1"));
        c.add(new JButton("2"));
        c.add(new JButton("3"));
        c.add(new JButton("4"));
        c.add(new JButton("5"));
        c.add(new JButton("6"));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(300,300);
    }
    public static void main(String[] args) throws Exception {
        new janela01();        
    }
}
