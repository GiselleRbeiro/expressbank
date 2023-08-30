package br.com.expressbank.banco.modelo;
 
public class CalculaImposto {
    
    private double totalImposto;

    public void registrar(Tributavel t) {
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }
   public double getTotalImposto() {
       return totalImposto;
   }
    
}
