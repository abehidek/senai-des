package f_enum;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {

        Scanner input = new Scanner(System.in);
        // System.out.println(Mensagens.BemVindo.getMsg());
        // System.out.println(MessageFormat.format("Digite {0} para não e {1} para sim", Opcoes.NAO.ordinal, Opcoes.SIM.ordinal));

        // try { 
        //     int op = input.nextInt();
        //     if (op == Opcoes.NAO.ordinal)
        //         System.out.println("Usuário escolheu não");
        //     else if (op == Opcoes.SIM.ordinal) 
        //         System.out.println("Usuário escolheu sim");
        //     else
        //         System.out.println("Usuário não escolheu corretamente");
        // } catch (Exception e) {
        //     System.out.println(e);
        // }


        // Thread.sleep(500);
        // System.out.println(Mensagens.Saiu.getMsg());


        List<String> colunas = new ArrayList<>(); 

        while (true) {
            String coluna = "";
            System.out.println("Digite o nome da coluna: ");
            coluna = input.nextLine();
            colunas.add(coluna);

            System.out.println("Deseja adicionar mais uma coluna? [S/N]: ");
            String op = input.nextLine().toUpperCase();
            if (op.equals("N")) break;
        }
        
        Gravar.adicionarColuna(colunas);

        while (true) {
            List<String> linhas = new ArrayList<>(); 
            List<String> csvColunas = Arrays.asList(Gravar.lerColunas().split(",")); 

            for (String csvColuna:csvColunas) {
                System.out.println(MessageFormat.format("Digite o campo da coluna {0}", csvColuna));
                linhas.add(input.nextLine());
            }

            Gravar.adicionarLinha(linhas);

            System.out.println("Deseja adicionar mais uma linha? [S/N]: ");
            String op = input.nextLine().toUpperCase();
            if (op.equals("N")) break;
        }

        input.close();
    }
}
