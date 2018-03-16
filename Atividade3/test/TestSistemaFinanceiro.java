

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andre
 */
public class TestSistemaFinanceiro {
    
    SistemaFinanceiro sistemaFin;
    public TestSistemaFinanceiro() {
    }
    
    @Before
    public void setUp(){
        sistemaFin = new SistemaFinanceiro();

    }

    @Test
    public void TestSalarioMenorQueMil() {
        
        Cliente cliente = new Cliente("Andressa",20,1000.0,500.0);
        
        ArrayList<Proposta> proposta =  sistemaFin.gerarPropostas(cliente);
        // verifica se é 2 propostas
        assertEquals(2,proposta.size());
        
        Proposta p1 = proposta.get(0);
        assertEquals(2 * 1000.0 , p1.getValoTotal(), 0.00001);
        assertEquals(2 , p1.getNumeroDeParcelas());
        assertEquals(2000.0/2 , p1.getValorDaParcela(),0.00001);
        
        Proposta p2 = proposta.get(1);
        assertEquals(2 * 1000.0 , p2.getValoTotal(), 0.00001);
        assertEquals(3 , p2.getNumeroDeParcelas());
        assertEquals(2000.0/3 , p2.getValorDaParcela(),0.00001);
    }
    
    
    @Test
    public void TestSalarioAteCincoMil() {
        
        Cliente cliente = new Cliente("Andressa",20,1000.0,2000.0);

        ArrayList<Proposta> proposta =  sistemaFin.gerarPropostas(cliente);
        // verifica se são 3 propostas
        assertEquals(3,proposta.size());
        
        Proposta p1 = proposta.get(0);
        assertEquals(1.3 * 1000.0 , p1.getValoTotal(), 0.00001);
        assertEquals(2 , p1.getNumeroDeParcelas());
        assertEquals(1.3* 1000.0/2 , p1.getValorDaParcela(),0.00001);
        
        Proposta p2 = proposta.get(1);
        assertEquals(1.5 * 1000.0 , p2.getValoTotal(), 0.00001);
        assertEquals(4 , p2.getNumeroDeParcelas());
        assertEquals(1.5 * 1000.0/4 , p2.getValorDaParcela(),0.00001);
        
        Proposta p3 = proposta.get(2);
        assertEquals(1.5 * 1000.0 , p3.getValoTotal(), 0.00001);
        assertEquals(10 , p3.getNumeroDeParcelas());
        assertEquals(1.5 * 1000.0/10 , p3.getValorDaParcela(),0.00001);
        
    }
    
    
    @Test
    public void TestSlarioMaiorQueCincoMil(){
        
        Cliente cliente = new Cliente("Andressa",20,100.0,7000.0);
        ArrayList<Proposta> proposta =  sistemaFin.gerarPropostas(cliente);
        
        // verifica se são 3 propostas
        assertEquals(4,proposta.size());
        
        Proposta p1 = proposta.get(0);
        assertEquals(1.1 * 100.0 , p1.getValoTotal(), 0.00001);
        assertEquals(2 , p1.getNumeroDeParcelas());
        assertEquals(1.1* 100.0/2 , p1.getValorDaParcela(),0.00001);
        
        Proposta p2 = proposta.get(1);
        assertEquals(1.3 * 100.0 , p2.getValoTotal(), 0.00001);
        assertEquals(4 , p2.getNumeroDeParcelas());
        assertEquals(1.3 * 100.0/4 , p2.getValorDaParcela(),0.00001);
        
        Proposta p3 = proposta.get(2);
        assertEquals(1.3 * 100.0 , p3.getValoTotal(), 0.00001);
        assertEquals(10 , p3.getNumeroDeParcelas());
        assertEquals(1.3 * 100.0/10 , p3.getValorDaParcela(),0.00001);  
        
        Proposta p4 = proposta.get(3);
        assertEquals(1.4 * 100.0 , p4.getValoTotal(), 0.00001);
        assertEquals(20 , p4.getNumeroDeParcelas());
        assertEquals(1.4 * 100.0/20 , p4.getValorDaParcela(),0.00001);
    }
    
    
}
