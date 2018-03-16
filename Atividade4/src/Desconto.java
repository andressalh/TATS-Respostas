
/**
 *
 * @author andre
 */
public class Desconto {
    double salarioLiquido;

    public double CalcularDesconto(String cargo, double salario){
        
        
        if (cargo == "Desenvolvedor" && salario >= 3000.0){
            salarioLiquido = salario - (salario * 0.20);
        }
        else {
             //salarioLiquido = salario - (salario * 0.10);
        }
        return salarioLiquido;
    }
    
}
