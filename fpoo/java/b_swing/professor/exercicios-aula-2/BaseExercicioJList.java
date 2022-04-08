import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BaseExercicioJList extends JFrame implements ActionListener {

    public static void main(String[] args) {
        new BaseExercicioJList();
    }

    JList<String> listaLinguagens;
    JList<String> listaConhecimento;
    DefaultListModel<String> listaInicial;
    DefaultListModel<String> listaEscolhas;

    public BaseExercicioJList(){
        super("Lista de linguagens");
        //criamos um JPanel
        Container painel = new JPanel();
        Container painelListas = new JPanel();
        Container botoes = new JPanel();
        Container conteudo = getContentPane();
        //definimos o tipo de layout
        painel.setLayout(new FlowLayout());
        painelListas.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 15, 10, 15);

        botoes.setLayout(new GridLayout(2,1, 1, 5));

        JLabel descritivo = new JLabel("Escolha as linguagens preferidas", SwingConstants.CENTER);
        descritivo.setPreferredSize(new Dimension(400, 50));

        JButton resetar = new JButton("Resetar");
        resetar.setPreferredSize(new Dimension(100, 50));
        resetar.addActionListener(this);

        JButton botaoAdd = new JButton(">>");
        botaoAdd.setPreferredSize(new Dimension(100, 20));
        botaoAdd.addActionListener(this);

        JButton botaoRemover = new JButton("<<");
        botaoRemover.setPreferredSize(new Dimension(100, 20));
        botaoRemover.addActionListener(this);

        botoes.add(botaoAdd, BorderLayout.SOUTH);
        botoes.add(botaoRemover, BorderLayout.NORTH);

        listaInicial = new DefaultListModel<>();
        listaEscolhas = new DefaultListModel<>();

        listaLinguagens = new JList<>(listaInicial);
        listaLinguagens.setBackground(Color.gray);

        listaConhecimento = new JList<>(listaEscolhas);
        listaConhecimento.setBackground(Color.GREEN);

        listaLinguagens.setBounds(250,100, 75,75);
        listaLinguagens.setPreferredSize(new Dimension(200, 200));
        listaConhecimento.setBounds(250,100, 75,75);
        listaConhecimento.setPreferredSize(new Dimension(200, 200));

        painel.add(descritivo);
        painelListas.add(listaLinguagens, constraints);
        painelListas.add(botoes, constraints);
        painelListas.add(listaConhecimento, constraints);
        painel.add(painelListas);
        painel.add(resetar);

        conteudo.add(painel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

