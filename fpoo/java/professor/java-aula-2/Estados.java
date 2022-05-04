import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Estados extends JFrame {
    public Estados() {
        super("Lista de Estados");

        Container painel = new JPanel();
        painel.setLayout(new FlowLayout());
        Container conteudo = getContentPane();

        JLabel descritivo = new JLabel("Selecione um estado na lista abaixo:", SwingConstants.CENTER);
        descritivo.setPreferredSize(new Dimension(400, 50));
        JButton continuar = new JButton("Continuar");
        continuar.setPreferredSize(new Dimension(200, 50));

        DefaultListModel<String> listaInicial = new DefaultListModel<>();
        listaInicial.addElement("SP");
        listaInicial.addElement("RJ");
        listaInicial.addElement("MG");
        listaInicial.addElement("SC");
        listaInicial.addElement("RS");
        listaInicial.addElement("ES");

        final JList<String> listaEstados = new JList<>(listaInicial);

        continuar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Verificar Escolha do Estado");
                String data = "";
                if (listaEstados.getSelectedIndex() != -1) {
                    data = "Estado Selecionado: " + listaEstados.getSelectedValue();
                    JOptionPane.showMessageDialog(null, data, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Por favor selecione um Estado", "Aviso", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        listaEstados.setBounds(250,100, 75,75);
        listaEstados.setPreferredSize(new Dimension(200, 200));

        painel.add(descritivo);
        painel.add(listaEstados);
        painel.add(continuar);

        conteudo.add(painel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Estados();
    }
}
