package e_polimorfismo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite a distância");
        double dist = new Scanner(System.in).nextDouble();
        CalcularFrete calculo1 = new CalcularFrete(dist);
        // System.out.println(calculo1.calcular());

        RelatórioFrete relatório = new RelatórioFrete(calculo1);
        // relatório.distância = 300;
        relatório.printFrete();


    }
}