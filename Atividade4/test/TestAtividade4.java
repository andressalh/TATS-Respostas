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
        Desconto desconto = new Desconto("Desenvolvedor", 3000.0);
        assertEqual(desconto.getDesconto, 0.20);
    
    }
}
