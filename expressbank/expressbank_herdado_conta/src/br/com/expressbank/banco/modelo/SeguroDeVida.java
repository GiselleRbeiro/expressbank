package br.com.expressbank.banco.modelo;
public  class SeguroDeVida  implements Tributavel {

    @Override
    public double getValorImposto() {
       return 42;
    }
    
}
