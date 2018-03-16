
import java.util.ArrayList;


/**
 *
 * @author andre
 */
class SistemaFinanceiro {

    ArrayList<Proposta> gerarPropostas(Cliente c) {
    ArrayList<Proposta> proposta = new ArrayList();
        
    if (c.getSalario() <= 1000.0)
        GerarProspostaFaixa1(proposta, c.getEmprestimo());                
    else if (c.getSalario() <= 5000.0)
        GerarProspostaFaixa2(proposta, c.getEmprestimo());                      
    else 
        GerarPropostaFaixa3(proposta, c.getEmprestimo());       
    return proposta;
        
    }

    private void GerarPropostaFaixa3(ArrayList<Proposta> proposta, double valorDoEmprestimo) {
        proposta.add(new Proposta(1.1,valorDoEmprestimo,2));
        proposta.add(new Proposta(1.3,valorDoEmprestimo,4));
        proposta.add(new Proposta(1.3,valorDoEmprestimo,10));
        proposta.add(new Proposta(1.4,valorDoEmprestimo,20));
    }

    private void GerarProspostaFaixa2(ArrayList<Proposta> proposta, double valorDoEmprestimo) {
        proposta.add(new Proposta(1.3,valorDoEmprestimo,2));
        proposta.add(new Proposta(1.5,valorDoEmprestimo,4));
        proposta.add(new Proposta(1.5,valorDoEmprestimo,10));
    }

    private void GerarProspostaFaixa1(ArrayList<Proposta> proposta, double valorDoEmprestimo) {
        proposta.add(new Proposta(2,valorDoEmprestimo,2));
        proposta.add(new Proposta(2,valorDoEmprestimo,3));
    }
    
    
       
    
}
