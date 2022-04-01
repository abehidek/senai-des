package b_swing;

import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;

public class ControleCheckBox extends JFrame implements ActionListener {
    JTextField texto;
    JCheckBox bold, italic;

    public ControleCheckBox(){
        super("Janela CheckBOX");

        texto = new JTextField("SENAI X BOSCH", 12);
        texto.setFont(new Font("Helvectica", Font.PLAIN, 25));

        bold = new JCheckBox("Bold");
        bold.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!bold.isSelected())
                    texto.setFont(new Font("Helvectica", Font.PLAIN,25));
                else
                    texto.setFont(new Font("serif", Font.BOLD,25));
            }
        });

        italic = new JCheckBox("Italic");
        italic.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!italic.isSelected())
                    texto.setFont(new Font("Helvectica", Font.PLAIN,25));
                else
                    texto.setFont(new Font("serif", Font.ITALIC, 25));
                }
        });

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(texto);
        c.add(bold);
        c.add(italic);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ControleCheckBox();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
