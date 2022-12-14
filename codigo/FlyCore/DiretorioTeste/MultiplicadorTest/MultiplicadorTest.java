package MultiplicadorTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import Utilitarios.AceleradorPts.IMultiplicavel;
import Utilitarios.AceleradorPts.MultiplicadorPrata;
import Utilitarios.AceleradorPts.MultiplicadorPreto;

public class MultiplicadorTest {
    //MP = PRATA ; MPE = PRETO
    private IMultiplicavel mp = new MultiplicadorPrata(); 
    private IMultiplicavel mpe = new MultiplicadorPreto();

    @Test
    public void multiplicarPTSdesativado(){
        mp.setPreco(250d);
        assertEquals(this.mp.multiplicar(200), 200);//retorna o proprio número quando desligado
        assertEquals(this.mpe.multiplicar(300), 300 );
        assertEquals(250d, this.mp.getPreco());
    }

    @Test
    public void multiplicarPTSativado(){
        this.mp.on_off();
        this.mpe.on_off();
       assertEquals(mp.multiplicar(500), 625); // x1,25
       assertEquals(mpe.multiplicar(500), 750);// x1,5
    }
    
    @Test
    public void gets() {
        mp.setPreco(250);
        mpe.setPreco(350);

        assertEquals(mp.getPreco(), 250d);
        assertEquals(mpe.getPreco(), 350d);
        assertEquals(mp.getTipo(), "prata");
        assertEquals(mpe.getTipo(), "preto");
    }
}
