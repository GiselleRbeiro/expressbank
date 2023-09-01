import br.com.expressbank.banco.modelo.Cliente;

public class TesteSistema {
    
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(2222);

        Cliente cliente = new Cliente();
        cliente.setSenha(3333);

        SistemaInterno si = new SistemaInterno();
        si.autenticar(g);
        si.autenticar(cliente);
    }
}
