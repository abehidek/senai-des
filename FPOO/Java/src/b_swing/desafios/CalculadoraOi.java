package b_swing.desafios;

import javax.swing.*;
import java.awt.*;

public class CalculadoraOi extends JFrame {
    public CalculadoraOi() {
        super("Calculadora");
        
        Container c = new JPanel();
        // c.add(painel);
        // c.setLayout(new GridLayout(5, 5, 3, 3));
        c.setLayout(new GridLayout(4,4,3,3));
        c.add(new JButton("7"));
        c.add(new JButton("8"));
        c.add(new JButton("9"));
        c.add(new JButton("/"));
        c.add(new JButton("4"));
        c.add(new JButton("5"));
        c.add(new JButton("6"));
        c.add(new JButton("+"));
        c.add(new JButton("1"));
        c.add(new JButton("2"));
        c.add(new JButton("3"));
        c.add(new JButton("."));
        c.add(new JButton("0"));
        c.add(new JButton("-"));
        c.add(new JButton("="));
        c.add(new JButton("*"));


        Container painel = getContentPane();
        painel.setLayout(new BorderLayout());
        painel.setSize(400, 400);
        painel.add(new JPanel(), BorderLayout.NORTH);
        painel.add(c, BorderLayout.SOUTH);
        
        
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setResizable(false);
        setVisible(true);
    }
}
