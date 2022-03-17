package b_swing;

import javax.swing.*;
import java.awt.*;

public class Label extends JFrame{

    public Label(){
        super("Janela JLabel");

        JLabel simples = new JLabel("texto simples");
        simples.setToolTipText("Texto ToolTip");
        
        Font font = new Font("serif", Font.BOLD, 25);
        JLabel label = new JLabel("Senai");
        label.setFont(font);
        label.setForeground(Color.red);

        ImageIcon image = new ImageIcon(getClass().getResource("senai.png"));
        JLabel imagem = new JLabel(image);
        imagem.setToolTipText("Imagem daora");

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(simples);
        c.add(label);
        c.add(imagem);
        
        c.add(new JCheckBox("Bold"));
        c.add(new JCheckBox("Italic"));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Label();
    }
}
