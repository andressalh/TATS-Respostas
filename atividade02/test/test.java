/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import atividade02.SenhaValidator;
import atividade02.Usuario;
import atividade02.UsuarioDAO;
import atividade02.UsuarioValidator;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
/**
 *
 * @author andre
 */
public class test {
    
    Usuario user = new Usuario();
    UsuarioValidator uValidator; 
    UsuarioDAO uDao;
    SenhaValidator senhaVal;

    /**
     *
     */
    @Before
    public void setUp() {
        
        senhaVal = mock(SenhaValidator.class);
        uDao = mock(UsuarioDAO.class);
        
        uValidator = new UsuarioValidator(uDao);
        uValidator.setSenhaValidator(senhaVal);
        
    }

    /**
     *
     * @throws Exception
     */
    @Test (expected = Exception.class)
    public void TestSenhaDiferente() throws Exception{
        Usuario usuario = new Usuario();
        usuario.setNome("Andressa");
        usuario.setSenha("12345");
        usuario.setSenhaConfirmada("123");
        
        this.uValidator.ehUsuarioValido(usuario);
    }
    
    /**
     *
     * @throws Exception
     */
    @Test (expected = Exception.class)
    public void TestNomePequeno() throws Exception{
        Usuario usuario = new Usuario();
        usuario.setNome("Ande");
        usuario.setSenha("123");
        usuario.setSenhaConfirmada("123");
        
        this.uValidator.ehUsuarioValido(usuario);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void TestSenhaErrada() throws Exception{
        Usuario usuario = new Usuario();
        usuario.setNome("Andressa");
        usuario.setSenha("*/S");
        usuario.setSenhaConfirmada("*/S");
        
        this.uValidator.ehUsuarioValido(usuario);
    }   
   
    /**
     *
     * @throws Exception
     */
    @Test 
    public void TestCaracterEspecialNoNome() throws Exception{
        Usuario usuario = new Usuario();

        usuario.setNome("%Andressa*");
        usuario.setSenha("123");
        usuario.setSenhaConfirmada("123");
                 
         assertFalse(this.uValidator.ehUsuarioValido(usuario));
    }
    
    /**
     *
     * @throws Exception
     */
    @Test 
    public void TestUsuarioExist() {
        Usuario usuario = new Usuario();
        usuario.setNome("Andressa");
        usuario.setSenha("123");
        usuario.setSenhaConfirmada("123");
        
        try{
        uValidator.ehUsuarioValido(usuario);
        } catch (Exception e){
            assertEquals("Usuário já existe", e.getMessage());
        }
               
    }
    
    /**
     *
     * @throws Exception
     */
    @Test 
    public void TestUsuarioCorreto() {
        Usuario usuario = new Usuario();
        usuario.setNome("Andressa");
        usuario.setSenha("123");
        usuario.setSenhaConfirmada("123");
        
        assertEquals("Andressa", usuario.getNome());
        assertEquals("123", usuario.getSenha());
        assertEquals("123", usuario.getSenhaConfirmada());
        
        
    }
    
}
