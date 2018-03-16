import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author andre
 */
public class TestAtividade4 {
    
    public TestAtividade4() {
    }

    
    @Before
    public void setUp() {
    }


    @Test
    public void TestCargoDesenvolvedorSalarioIgualouMaiorque3000() {
        Desconto desconto = new Desconto();       
        assertEquals(desconto.CalcularDesconto("Desenvolvedor", 5000.0), 4000.0,0.00001);
    }
    
    @Test
    public void TestCargoDesenvolvedorSalarioMenorque3000() {
        Desconto desconto = new Desconto();       
        assertEquals(desconto.CalcularDesconto("Desenvolvedor", 2900.0), 2610.0,0.00001);
    }
    
    @Test
    public void TestCargoDBASalarioMaiorouIgualque2000() {
        Desconto desconto = new Desconto();       
        assertEquals(desconto.CalcularDesconto("DBA", 2500.0), 1875.0,0.00001);
    }
    
    @Test
    public void TestCargoDBASalariomenorQue2000() {
        Desconto desconto = new Desconto();       
        assertEquals(desconto.CalcularDesconto("DBA", 1500.0), 1275.0,0.00001);
    }
    
    @Test
    public void TestCargoTestadorSalarioMaiorouIgualque2000() {
        Desconto desconto = new Desconto();       
        assertEquals(desconto.CalcularDesconto("Testador", 2500.0), 1875.0,0.00001);
    }

}
