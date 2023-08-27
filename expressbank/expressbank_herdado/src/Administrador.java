public abstract class Administrador extends Employee implements FuncionarioAutenticavel {

    private AutenticadorMaster autenticador;

    public Administrador() {
        this.autenticador = new AutenticadorMaster();
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