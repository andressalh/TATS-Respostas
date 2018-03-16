

import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andre
 */
public class TestControlador {
    
    public TestControlador() {
    }

    
    @Before
    public void setUp() {
    }

    @Test
    public void TestDadosCliente() {
        Cliente cliente = new Cliente("Andressa", 27,300.0,2000.0);
        Controlador controlador = new Controlador();
        List<Proposta> proposta = controlador.processar(cliente);
        assertEquals(3, proposta.size());
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void TestDadosClienteIncorreto(){
        Cliente cliente = new Cliente("", 27,300.0,2000.0);
        Controlador controlador = new Controlador();
        controlador.processar(cliente);
    }
}
