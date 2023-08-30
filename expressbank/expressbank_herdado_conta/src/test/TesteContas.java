package test;

import br.com.expressbank.banco.modelo.ContaCorrente;
import br.com.expressbank.banco.modelo.ContaPoupanca;

public class TesteContas {
    
    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.depositar(100.0);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.depositar(200.0);

        cc.transferir(10.0, cp);

        System.out.println("cc: " + cc.getSaldo());
        System.out.println("cp: " + cp.getSaldo());

    }
}