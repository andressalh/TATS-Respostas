
/**
 *
 * @author andre
 */
public class Desconto {
    double salarioLiquido;

    public double CalcularDesconto(String cargo, double salario){
        
        
        if (cargo == "DESENVOLVEDOR" ){
            if (salario >= 3000.0){
                salarioLiquido = salario - (salario * 0.20);
            }
            else {
             salarioLiquido = salario - (salario * 0.10);
            }
        }     
        
        if (cargo == "DBA" )
        {
            if (salario >= 2000){
                salarioLiquido = salario - (salario * 0.25);
            }
            else {
                salarioLiquido = salario - (salario * 0.15);
            }
        }
        
        if (cargo == "TESTADOR" )
        {
            if (salario >= 2000){
                salarioLiquido = salario - (salario * 0.25);
            }
            else {
                salarioLiquido = salario - (salario * 0.15);
            }
        }
        
        if (cargo == "GERENTE"){
            if (salario >= 5000.0){
                salarioLiquido = salario - (salario * 0.30);
            }
            else{
                salarioLiquido = salario - (salario * 0.20);
            }
        }
        
        return salarioLiquido;
    }
    
}
