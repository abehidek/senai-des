package e_polimorfismo;

public class CalcularFrete implements Calcular {
    public double distância;

    public CalcularFrete(double distância) {
        this.distância = distância;
    }
    public CalcularFrete() {}
    public double calcular() {
        return this.distância * 0.5;
    }
    public double calcF() {
        double valorDis = distância * 0.5;
        return this.calcICMS(valorDis);
    }
    public double calcICMS(double valorFrete) {
        // taxar em 20%
        return valorFrete += valorFrete * 0.2;
    }
    @Override
    public double calcICMS() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public double calcIPI() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public double calcDesgastePneus() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public double calcOleo() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public double calcCombustivel() {
        // TODO Auto-generated method stub
        return 0;
    }
}
