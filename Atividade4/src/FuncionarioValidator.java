/**
 *
 * @author andre
 */
class FuncionarioValidator {

    public static void Validar(Funcionario funcionario) throws IllegalArgumentException {
        
        
        if(funcionario.getNome().trim().equals("")){
            throw new IllegalArgumentException("O nome está vazio");
        }
        
        if(funcionario.getEmail().trim().equals("")){
            throw new IllegalArgumentException("O email está vazio");
        }
     
        if(funcionario.getSalarioBase() < 0){
            throw new IllegalArgumentException("O salario é menor que 0");
        }
        
        if(funcionario.getCargo().trim().equals("")){
            throw new IllegalArgumentException("O cargo está vazio");
        }
        
        
       
    }
    
}
