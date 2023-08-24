public class SistemaInterno {

    private int senha = 2222;

    public void autenticar(Manager m) {
        boolean autenticou = m.autentica(this.senha);
        if (autenticou) {
            System.out.println("Sistema Libeado!");

        } else {
            System.out.println("O sitema requer um login!");
        }
     }

}
