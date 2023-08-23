public class TestReference {

    public static void main(String[] args) {

        Manager m1 = new Manager();
        m1.setNome("Marcos");
        m1.setSalario((5000.0));

        Employee e = new Engineer();
        e.setSalario(2000.0);

        Engineer en = new  Engineer();
        e.setSalario(2500.0);

        ControlBenefit controle = new ControlBenefit();
        controle.registrar(m1);
        controle.registrar(e);
        controle.registrar(en);


        System.out.println(controle.getSoma());
    }
    
}
