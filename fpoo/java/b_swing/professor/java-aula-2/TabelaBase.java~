import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TabelaBase extends  JFrame {
    DefaultTableModel model;

    public TabelaBase() {
        super("Relatório");

        Container painel = new JPanel();
        painel.setPreferredSize(new Dimension(150, 100));

        String dadosAlunos[][] = {
                {"1","Nome Aluno 1","10.0", "0"},
                {"2","Nome Aluno 2","9.5", "10"},
                {"3","Nome Aluno 3","4.1", "22"}
        };

        String colunas[]={"ID","Aluno","Nota", "Faltas"};

        model = new DefaultTableModel();
        JTable table = new JTable(model);

        //colunas da tabela
        model.addColumn("ID");
        model.addColumn("Aluno");
        model.addColumn("Nota");
        model.addColumn("Faltas");

        //dados dos alunos
        model.addRow(new Object[]{"1", "Aluno 1", "8.3", "0"});

        JTable tabela = new JTable(dadosAlunos,colunas);

        tabela.setDefaultEditor(Object.class, null);
        tabela.setBounds(30,40,200,100);

        JScrollPane scrollPainel =new JScrollPane(table);
        painel.add(scrollPainel);

        Container conteudo = getContentPane();
        conteudo.add(painel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setVisible(true);

        //criamos o botão
        JButton botaoAdd = new JButton("Inserir Novo");
        botaoAdd.setPreferredSize(new Dimension(200, 50));

        //identificar o clique no botão
        botaoAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //adicionamos um novo registro a tabela
                model.addRow(new Object[]{"1", "Novo Aluno", "6", "3"});
            }
        });

        painel.add(botaoAdd);
    }

    public static void main(String[] args) {
        new TabelaBase();
    }
}
