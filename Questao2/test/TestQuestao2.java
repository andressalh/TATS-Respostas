/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import questao2.Classificador;
import questao2.Pessoa;

/**
 *
 * @author andre
 */
public class TestQuestao2 {
    
    Classificador classificador = new Classificador();
    
    

    
    @Before
    public void setUp() {
        

    }

    @Test
    public void TestIdadeInvalida() {
        
       Pessoa pessoa = new Pessoa("Andressa", 111);
       Classificador cla = new Classificador();
       try{
           cla.definirFaixaEtaria(pessoa);
           fail();
       }
       catch (Exception e){          
        assertEquals("idade invalida", e.getMessage());
       }
        
    }
    
    @Test
    public void TestCrianca() {
        
       Pessoa pessoa = new Pessoa("Andressa", 10);
       Classificador cla = new Classificador();
       assertEquals("Andressa eh crianca", cla.definirFaixaEtaria(pessoa));
 
       
    }
    
    @Test
    public void TestAdolescente() {
        Pessoa pessoa = new Pessoa("Andressa", 17);
       Classificador cla = new Classificador();
       assertEquals("Andressa eh adolescente", cla.definirFaixaEtaria(pessoa));
    }
    
    
    @Test
    public void TestAdulto() {
       Pessoa pessoa = new Pessoa("Andressa", 58);
       Classificador cla = new Classificador();
       assertEquals("Andressa eh adulto", cla.definirFaixaEtaria(pessoa)); 
    }
    
    @Test
    public void TestIdoso() {
      Pessoa pessoa = new Pessoa("Andressa", 63);
       Classificador cla = new Classificador();
       assertEquals("Andressa eh idoso", cla.definirFaixaEtaria(pessoa));
    }
    
    
}
