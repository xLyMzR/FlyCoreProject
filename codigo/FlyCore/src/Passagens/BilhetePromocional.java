package Passagens;

public class BilhetePromocional extends Bilhete {
    public BilhetePromocional() {
        super();
    }

    @Override
    public double calcularPreco() {
        double precoBase = super.calcularPreco(), novoPreco = 0d;
        novoPreco = precoBase * 0.06;
        this.precoBilhete = novoPreco;
        return novoPreco;
    }
}