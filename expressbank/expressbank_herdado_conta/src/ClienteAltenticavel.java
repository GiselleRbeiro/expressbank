public class ClienteAltenticavel implements FuncionarioAutenticavel {

    private int senha;

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
        }

    @Override
    public boolean autenticar(int senha) {
       if(this.senha == senha) {
        return true;
       }else {
        return false;
       }
    }

}
