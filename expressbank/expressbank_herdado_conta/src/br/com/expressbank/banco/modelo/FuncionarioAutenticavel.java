package br.com.expressbank.banco.modelo;

public interface FuncionarioAutenticavel {

    void setSenha(int senha);

    boolean autenticar(int senha);

}