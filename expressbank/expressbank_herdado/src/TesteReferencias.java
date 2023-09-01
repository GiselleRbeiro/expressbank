
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
	
		Engenheiro en = new Engenheiro();
		en.setSalario(2500.0);
		
			
		ControleBeneficio controle = new ControleBeneficio();
		controle.registrar(g1);
		controle.registrar(en);
		
		
		System.out.println(controle.getSoma());
		
	}

}
