package br.com.expressbank.banco.modelo.teste;

import br.com.expressbank.banco.modelo.ContaCorrente;
import br.com.expressbank.banco.modelo.ContaPoupanca;
import br.com.expressbank.banco.modelo.SaldoInsuficienteException;

//br.com.bytebank.banco.teste.TesteContas
public class TesteContas {
	
	//java.lang.String
	public static void main(String[] args) throws SaldoInsuficienteException{
		int a = 3;
		int b = a / 0;
		
		
		ContaCorrente outra = null;
		//outra.deposita(200.0); 
					
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.depositar(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.depositar(200.0);
		
		cc.transferir(10.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());


	}

}
