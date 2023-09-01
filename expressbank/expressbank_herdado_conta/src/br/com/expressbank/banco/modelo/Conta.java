package br.com.expressbank.banco.modelo;

/**
 * Classe que representa a moldura de uma conta
 * 
 * @author Giselle Ribeiro
 * 
 */
public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    Cliente titular;
    private static int total = 0;
    private int agencia2;
    
    /**
     * Construtor para inicializar o objeto Conta a partir da agencia e numero.
     *  
     * @param agencia
     * @param numero
     */
   
   
    /**
     * Valor precisa ser maior do que o saldo.
     * 
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public Conta(int agencia, int numero){
        Conta.total++;
      //  System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100;
       // System.out.println("Estou criando uma conta " + this.numero);
    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean sacar(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(double valor, Conta destino) {
        if(this.sacar(valor)) {
                destino.depositar(valor);
                return true;
        } else {
                return false;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
        System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agencia = agencia;
    }

    public void setTitular(Cliente joao){
        this.titular = joao;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }

}