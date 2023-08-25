public class SistemaInterno {

    private int senha = 2222;

    public void autenticar(FuncionarioAutenticavel fa) {
        boolean autenticou = fa.autenticar(this.senha);
        if (autenticou) {
            System.out.println("Sistema Libeado!");

        } else {
            System.out.println("O sistema requer um login!");
        }
     }

}
