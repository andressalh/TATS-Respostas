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

}
