/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andre
 */
public class TestClienteValidator {
    
    public TestClienteValidator() {
    }
    

    
    @Before
    public void setUp() {
    }


    @Test (expected = IllegalArgumentException.class)
    public void TestNomeVazio() {
        Cliente cliente = new Cliente("", 27, 100.0, 7000.0);
        ClienteValidator.Validar(cliente);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void TestMenorqueZero() {
        Cliente cliente = new Cliente("Andressa", 27, 100.0, -10.0);
        ClienteValidator.Validar(cliente);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void TestIdadeInvalida() {
        Cliente cliente = new Cliente("Andressa", 10, 1000.0, 1000.0);
        ClienteValidator.Validar(cliente);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void TestValorDoemprestimoIncorreto() {
        Cliente cliente = new Cliente("Andressa", 27, 87.0, 1000.0);
        ClienteValidator.Validar(cliente);
    }
}
