import javax.swing.*;
import java.awt.*;

public class Paises extends JFrame {
    public static void main(String[] args) {
        new Paises();
    }

    public Paises() {
        super("Lista de Países");

        Container painel = new JPanel();
        Container conteudo = getContentPane();

        DefaultListModel<String> listaInicial = new DefaultListModel<>();
        listaInicial .addElement("Brasil");
        listaInicial.addElement("Argentina");
        listaInicial.addElement("Chile");
        listaInicial.addElement("Paraguai");
        listaInicial.addElement("Uruguai");
        listaInicial.addElement("Venezuela");
        JList<String> listaPaises = new JList<>(listaInicial);

        listaPaises.setPreferredSize(new Dimension(400, 200));

        JLabel descritivo = new JLabel("Selecione um país na lista abaixo:");
        painel.add(descritivo);
        painel.add(listaPaises);

        conteudo.add(painel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 300);
        setVisible(true);
    }

}
