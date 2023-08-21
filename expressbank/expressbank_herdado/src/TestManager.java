public class TestManager {

    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.setNome("Marcos");
        m1.setCpf("123456789-12");
        m1.setSalario(5000.0); 
        

        System.out.println(m1.getNome());
        System.out.println(m1.getCpf());
        System.out.println(m1.getSalario());
        
        m1.setSenha(2222);
        boolean autenticou = m1.autentica(2222);

        System.out.println(autenticou);

        System.out.println(m1.getbenefit());

    }
    
}
