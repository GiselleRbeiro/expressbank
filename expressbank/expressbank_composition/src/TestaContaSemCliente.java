public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.getSaldo());

		contaDaMarcela.setTitular(new Cliente());
		System.out.println(contaDaMarcela.titular);

		contaDaMarcela.titular.setNome("Marcela");
		System.out.println(contaDaMarcela.titular.getNome());

	}
}