/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
        Funcionario funcionario = new Funcionario("", andre@gmail.com, 2000.0, "DESENVOLVEDOR");
        FuncionarioValidator.Validar(funcionario);
    }
}
