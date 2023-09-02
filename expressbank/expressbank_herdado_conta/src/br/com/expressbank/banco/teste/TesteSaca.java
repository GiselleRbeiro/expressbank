package br.com.expressbank.banco.teste;

import br.com.expressbank.banco.modelo.Conta;
import br.com.expressbank.banco.modelo.ContaCorrente;
import br.com.expressbank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		
		conta.depositar(200.0);
		
		conta.sacar(210.0);
		
		System.out.println(conta.getSaldo());

	}
}


	//trecho de código omitido, após a opção ação do vscode.
	//try {
	//		conta.sacar(210.0);
	//	} catch(SaldoInsuficienteException ex) {
	//		System.out.println("Ex: " + ex.getMessage());
	//	}
		