/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */
class Proposta {
    
    double ValoTotal, ValorDaParcela;
    int numeroDeParcelas;
    
    public Proposta(double fator, double valorDoEmprestimo, int numeroDeParcelas){
        this.numeroDeParcelas = numeroDeParcelas;
        ValoTotal = fator * valorDoEmprestimo;
        ValorDaParcela = ValoTotal/numeroDeParcelas;
    }
            
    public double getValoTotal() {
        return ValoTotal;
    }

    public void setValoTotal(double ValoTotal) {
        this.ValoTotal = ValoTotal;
    }

    public double getValorDaParcela() {
        return ValorDaParcela;
    }

    public void setValorDaParcela(double ValorDaParcela) {
        this.ValorDaParcela = ValorDaParcela;
    }

    public int getNumeroDeParcelas() {
        return numeroDeParcelas;
    }

    public void setNumeroDeParcelas(int numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
    }

    
    
}
