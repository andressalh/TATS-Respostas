

/**
 *
 * @author andre
 */
public class ClienteValidator {
    
    public static void Validar(Cliente c) throws IllegalArgumentException {
        if(c.getNome().trim().equals("")){
            throw new IllegalArgumentException("O nome está vazio");
        }
        
        if(c.getSalario() < 0){
            throw new IllegalArgumentException("Com esse salario não é permitido fazer emprestimo");
        }
        
        if(c.getEmprestimo() < 100.0 || c.getEmprestimo() > 100000.0){
            throw new IllegalArgumentException("Com esse salario não é permitido fazer emprestimo");
        }
        
        if(c.getIdade() < 18 || c.getIdade() > 70){
            throw new IllegalArgumentException("Você precisa ter mais de 18 e menos que 70");
        }
    }
}
