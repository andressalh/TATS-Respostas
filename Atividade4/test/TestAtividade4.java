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
        assertEquals(desconto.CalcularDesconto("DESENVOLVEDOR", 5000.0), 4000.0,0.00001);
    }
    
    @Test
    public void TestCargoDesenvolvedorSalarioMenorque3000() {
        Desconto desconto = new Desconto();       
        assertEquals(desconto.CalcularDesconto("DESENVOLVEDOR", 2900.0), 2610.0,0.00001);
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
        assertEquals(desconto.CalcularDesconto("TESTADOR", 2500.0), 1875.0,0.00001);
    }

    @Test
    public void TestCargoTestadorSalarioMenorque2000() {
        Desconto desconto = new Desconto();       
        assertEquals(desconto.CalcularDesconto("TESTADOR", 1500.0), 1275.0,0.00001);
    }
    
    @Test
    public void TestCargoGerenteSalarioMaiorouIgualque5000() {
        Desconto desconto = new Desconto();       
        assertEquals(desconto.CalcularDesconto("GERENTE", 5500.0), 3850.0,0.00001);
    }
    

    @Test
    public void TestCargoGerenteSalarioMenorque2000() {
        Desconto desconto = new Desconto();       
        assertEquals(desconto.CalcularDesconto("GERENTE", 2500.0), 2000.0,0.00001);
    }
}
