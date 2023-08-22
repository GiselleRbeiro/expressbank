public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDojoao = new Conta(0, 0);
		contaDojoao.depositar(100);
		contaDojoao.depositar(50);
		System.out.println(contaDojoao.getSaldo());

		boolean conseguiuRetirar = contaDojoao.sacar(20);
		System.out.println(contaDojoao.getSaldo());
		System.out.println(conseguiuRetirar);

		Conta contaDaMarcela = new Conta(0, 0);
		contaDaMarcela.depositar(1000);

		boolean sucessoTransferencia = contaDaMarcela.transferir(300, contaDojoao);

		if (sucessoTransferencia) {
			System.out.println("transferencia com sucesso");

		} else {
			System.out.println("faltou dinheiro");

		}
		System.out.println(contaDaMarcela.getSaldo());
		System.out.println(contaDojoao.getSaldo());

}
}