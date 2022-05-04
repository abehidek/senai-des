package e_polimorfismo;

public class RelatórioFrete extends CalcularFrete {

    private CalcularFrete frete;

    public RelatórioFrete(CalcularFrete frete) {
        this.frete = frete;
    }
    public void printFrete() {
        System.out.println(frete.calcF());
    }
    public void printFrete(double distancia) {
        // Output: valor do frete
        //System.out.println(calcular());
        System.out.println("carga pesada");
        CalcularFrete calc1 = new CalcularFrete(distancia); 
        System.out.println(calc1.calcular());
    } 
}
