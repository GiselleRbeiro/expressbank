public class TesteSistema {
    
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setSenha(2222);

        SistemaInterno si = new SistemaInterno();
        si.autenticar(m);
    }
}
