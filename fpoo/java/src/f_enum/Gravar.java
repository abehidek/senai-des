package f_enum;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Gravar {

    public static String ListToString(List<String> list) {
        String str = "";
        for (String item:list) { str += item+","; }
        return str.substring(0, str.length() -1);
    }

    public static void adicionarColuna(List<String> colunas) throws IOException { 
        Path caminho = Paths.get("fpoo/java/src/f_enum/csv.csv");
        List<String> lista = new ArrayList<>();
        lista.add(ListToString(colunas));
    
        Files.write(caminho, lista, StandardCharsets.UTF_8);
    }  

    public static String lerColunas() throws IOException {
        Path caminho = Paths.get("fpoo/java/src/f_enum/csv.csv");
        List<String> linhas = Files.readAllLines(caminho, StandardCharsets.UTF_8);
        return linhas.get(0);
    }

    public static void adicionarLinha(List<String> colunas) throws IOException { 
        Path caminho = Paths.get("fpoo/java/src/f_enum/csv.csv");
        List<String> lista = new ArrayList<>();
        lista.add(ListToString(colunas)); 
        Files.write(caminho, lista, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
    }
}

/* 

O PROGRAMA DEVE PERMITIR INUMERAS COLUNAS (X)
PERGUNTE AO USUARIO SE DESEJA ADICIONAR UMA NOVA COLUNA OU PROSSEGUIR
PEDIR AO USUARIO AS COLUNAS DO CSV (1 LINHA)

LER AO MENOS 2 REGISTROS (VALORES DAS COLUNAS)

PASSAR ESSA LISTA COMO PARAMETRO PARA SALVAR O CSV (salvarCSV())
GRAVAR CSV
*/