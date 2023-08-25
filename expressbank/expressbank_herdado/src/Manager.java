//Manager é uma extensao de  Employee
public class Manager extends Employee implements FuncionarioAutenticavel { 
  
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }
    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        } else { 
            return false;
        }
    }
   
     public double getbenefit() {
        System.out.println("Chamando a bonificação do GERENTE");
        return super.getSalario();

    }
    @Override
    public boolean autenticar(int senha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'autenticar'");
    }
}
