public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDojoao = new Conta();
		contaDojoao.saldo = 100;
		contaDojoao.depositar(50);
		System.out.println(contaDojoao.saldo);

		boolean conseguiuRetirar = contaDojoao.sacar(20);
		System.out.println(contaDojoao.saldo);
		System.out.println(conseguiuRetirar);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.depositar(1000);

		boolean sucessoTransferencia = contaDaMarcela.transferir(300, contaDojoao);

		if (sucessoTransferencia) {
			System.out.println("transferencia com sucesso");

		} else {
			System.out.println("faltou dinheiro");

		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDojoao.saldo);
	}

}