/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import questao4.Funcionario;
import questao4.FuncionarioDAO;
import questao4.ReceitaFederal;
import questao4.RelatorioDeFuncionarios;

/**
 *
 * @author andre
 */
public class TestQuestao4 {
    Funcionario func = new Funcionario();
    FuncionarioDAO funcDAO;
    ReceitaFederal recFed;
    RelatorioDeFuncionarios RelFunc;

    
    @Before
    public void setUp() {
        funcDAO = mock(FuncionarioDAO.class);
        recFed = mock(ReceitaFederal.class);
    }


    @Test(expected = Exception.class)
    public void TestTecnico() {
    func.setCpf("123");
    func.setNome("Andressa");
    func.setId(1);
    funcDAO.getFuncionariosBy("Tecnico");
    
    func.setCpf("222");
    func.setNome("Lua");
    func.setId(2);
    funcDAO.getFuncionariosBy("Tecnico");
    
    
    
    
    //recFed.isCPFBloqueado("123");
    //recFed.isCPFBloqueado("222");
    
    int a = (RelFunc.getFuncComCPFBloqueado("tecnico"));
        System.out.println(a);
        System.out.println("a");
        Assert.assertEquals(5, a);
    

    }
}
