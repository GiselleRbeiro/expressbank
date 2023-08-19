public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDojoao = new Conta();
		contaDojoao.deposita(100);
		contaDojoao.deposita(50);
		System.out.println(contaDojoao.getSaldo());

		boolean conseguiuRetirar = contaDojoao.saca(20);
		System.out.println(contaDojoao.getSaldo());
		System.out.println(conseguiuRetirar);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);

		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDojoao);

		if (sucessoTransferencia) {
			System.out.println("transferencia com sucesso");

		} else {
			System.out.println("faltou dinheiro");

		}
		System.out.println(contaDaMarcela.getSaldo());
		System.out.println(contaDojoao.getSaldo());

}
}