package Utilitarios.AceleradorPts;

public class MultiplicadorPrata implements IMultiplicavel{

    private static final String tipo = "prata";
    private static double preco=0d;
    private boolean ativo = false;
    private  static  final double valor = 1.50;
    
    public MultiplicadorPrata(){
        this.ativo = false;
    }

    @Override
    public int multiplicar(int pts) {
        int total = pts; 
        if(this.ativo)
            total = (int) (int ) (pts*MultiplicadorPrata.valor);
        return total;
    }

    @Override
    public boolean on_off() {
        this.ativo = !this.ativo;
        return this.ativo;
    }

    @Override
    public double getPreco() {
        return MultiplicadorPrata.preco;
    }

    @Override
    public Object trocar() {
        return new MultiplicadorPreto();
    }
    @Override
    public String getTipo() {
        return MultiplicadorPrata.tipo;
    }
    public static double setPreco(double val){
        if(val >0)
            MultiplicadorPrata.preco = val;
        return val;
    }
}
