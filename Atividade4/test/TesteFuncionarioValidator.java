
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andre
 */
public class TesteFuncionarioValidator {
    
    public TesteFuncionarioValidator() {
    }
    
    
    
    @Before
    public void setUp() {
    }

    
    @Test (expected = IllegalArgumentException.class)
    public void TestNomeVazio() {
       Funcionario funcionario = new Funcionario("", "andre@g.com", 1000.0, "DESENVOLVEDOR");
       FuncionarioValidator.Validar(funcionario);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void TestEmailVazio() {
       Funcionario funcionario = new Funcionario("Andressa", "", 1000.0, "DESENVOLVEDOR");
       FuncionarioValidator.Validar(funcionario);
    }
}
