public class TesteSacaNeagivo {
	public static void main(String[] args) {

		Conta conta = new ContaCorrente(1337, 23334);
		conta.depositar(200.0);
		System.out.println(conta.getSaldo());

		conta.setAgencia(570);
		System.out.println(conta.getAgencia());
		
		System.out.println("O total de contas é : " + conta.getTotal());

		conta.sacar(101);

		System.out.println(conta.getSaldo());

	}
}