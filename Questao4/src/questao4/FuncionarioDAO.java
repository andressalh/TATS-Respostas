/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao4;

import java.util.ArrayList;

/**
 *
 * @author andre
 */
public interface FuncionarioDAO {
    public ArrayList<Funcionario> getFuncionariosBy(String categoria);
}
