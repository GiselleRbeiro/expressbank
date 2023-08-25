//contrato Autenticavel

public abstract interface FuncionarioAutenticavel  {

    public abstract void setSenha(int senha);
          
    public abstract boolean autenticar(int senha);
    
}
