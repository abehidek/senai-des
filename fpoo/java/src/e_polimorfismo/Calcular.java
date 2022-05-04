package e_polimorfismo;

public interface Calcular extends CalcTributos, CalcDesgaste {
    // Não possui construtor
    // Não pode ser instanciada
    // Expoem os métodos para que possam ser utilizados depois.
    double calcF();
    double calcICMS(double valorFrete);
    double calcCombustivel();
}
