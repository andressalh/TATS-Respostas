

import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import questao1.Extremos;
import questao1.Utilitario;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
/**
 *
 * @author andre
 */
public class TestQuestao1 {
    
    Extremos extremos;
   
    
    @Before
    public void setUp() {
        
        extremos = mock(Extremos.class);
    }

    @Test  
    public void TestAcharExtremo() throws Exception{
        Utilitario utilitario = new Utilitario();
        int[] i = {1, 2, 3, 4, 5, 6};
        extremos = utilitario.acharExtremos(i);
        assertEquals(extremos.getMenor(), 1);
        assertEquals(extremos.getIndiceMenor(), 0);
        assertEquals(extremos.getMaior(), 6);
        assertEquals(extremos.getIndiceMaior(), 5);
        
       
        
    }
    
    @Test 
    public void TestAcharExtremo2() throws Exception{
        
        Utilitario utilitario = new Utilitario();
        int[] i = {1, 99, 3, -5, 8 };
        extremos = utilitario.acharExtremos(i);
        assertEquals(extremos.getMenor(), -5);
        assertEquals(extremos.getIndiceMenor(), 3);
        assertEquals(extremos.getMaior(), 99);
        assertEquals(extremos.getIndiceMaior(), 1);

    }
    
    @Test 
    public void TestZeroElementos() {
        
        Utilitario utilitario = new Utilitario();
        int[] i = {}; 
        
        try{
           extremos = utilitario.acharExtremos(i);  
           fail();
        }
        catch(Exception e){
            assertEquals("vetor com zero elementos", e.getMessage());
        }
        
        

    }
     @Test 
    public void TestNulo(){
        
        Utilitario utilitario = new Utilitario();
        int[] i = null;
        
        try{
           extremos = utilitario.acharExtremos(i);  
           fail();
        }
        catch(Exception e){
            assertEquals("vetor nao pode ser nulo",  e.getMessage());
        }

    }



    
}
