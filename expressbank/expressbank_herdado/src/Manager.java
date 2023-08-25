//Manager é uma extensao de  Employee
public class Manager extends Employee implements FuncionarioAutenticavel { 
  
    private AutenticadorMaster autenticador;

    public Manager() {
        this.autenticador = new AutenticadorMaster();
    }
    
    public double getbenefit() {
        System.out.println("Chamando a bonificação do GERENTE");
        return super.getSalario();
    }

    @Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
			}

	@Override
	public boolean autenticar(int senha) {
		return this.autenticador.autenticar(senha);
    
    }

}
