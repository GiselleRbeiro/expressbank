public class TestaBanco {
	public static void main(String[] args) {
		Cliente joao = new Cliente();
		joao.setNome("João Mateus");
		joao.setCpf("222.222.222.-22");
		joao.setProfissao("programador");

		Conta contaDojoao = new ContaCorrente(0, 0);
		contaDojoao.depositar(100);

		contaDojoao.setTitular(joao);
		System.out.println(contaDojoao.getTitular().getNome());
		System.out.println(contaDojoao.getTitular());

	}
}