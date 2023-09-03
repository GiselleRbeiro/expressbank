package br.com.expressbank.banco.modelo;

import br.com.expressbank.banco.modelo.ContaCorrente;

public class CalculaImposto {
    
    private double totalImposto;

    public void registrar(SeguroDeVida seguro) {
        double valor = seguro.getValorImposto();
        this.totalImposto += valor;
    }
   public double getTotalImposto() {
       return totalImposto;
   }
public void registrar(br.com.expressbank.banco.modelo.ContaCorrente cc) {
}
    
}
