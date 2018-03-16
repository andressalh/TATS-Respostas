
import java.util.List;


/**
 *
 * @author andre
 */
public class Controlador {
    
    List<Proposta> processar (Cliente cliente){
        ClienteValidator.Validar(cliente);
        SistemaFinanceiro sistemafin = new SistemaFinanceiro();
        return sistemafin.gerarPropostas(cliente);
    }
}
