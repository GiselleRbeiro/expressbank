import modelo.Cliente;

public class TesteSistema {
    
    public static void main(String[] args) {
        Gerente m = new Gerente();
        m.setSenha(2222);

        Cliente cliente = new Cliente();
        cliente.setSenha(3333);

        SistemaInterno si = new SistemaInterno();
        si.autenticar(m);
        si.autenticar(cliente);
    }
}
