//Manager é uma extensao de  Employee

public class Gerente extends Funcionario implements FuncionarioAutenticavel { 
  
    private AutenticadorMaster autenticador;

    public Gerente() {
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
