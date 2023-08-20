public class TesteEmployee {

public static void main(String[] args) {
    
    Employee joao = new Employee();
    joao.setNome("João Matheus");
    joao.setCpf("222.222.222.22");
    joao.setSalario(2590.80);

    System.out.println(joao.getCpf());
     System.out.println(joao.getBonification());
}
    
}
