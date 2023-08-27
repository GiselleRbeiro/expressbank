public class Cliente implements FuncionarioAutenticavel {

	private int senha;	

	@Override
    public void setSenha(int senha){
        this.senha = senha;
    }

    @Override
    public boolean autenticar(int senha){

        if(this.senha == senha){
            return true;
        } else {
            return false;
        }
    }

    public char[] getNome() {
        return null;
    }

    public void setProfissao(String string) {
    }

    public void setCpf(String string) {
    }

    public void setNome(String string) {
    }
}
