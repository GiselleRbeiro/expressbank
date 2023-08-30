package br.com.expressbank.banco.modelo;
public class AutenticadorMaster {

    private int senha;


    public void setSenha(int senha) {
        this.senha = senha;
    }
    public boolean autenticar(int senha){
        if(this.senha == senha){
            return true;
        } else { 
            return false;
        }

    }
    public double getbenefit(){
        return 50;
    }
}
