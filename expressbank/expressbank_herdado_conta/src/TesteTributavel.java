public class TesteTributavel {

    public static void main(String[] args){
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.depositar(100.0);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculaImposto calc = new CalculaImposto();

        calc.registrar(cc);
        calc.registrar(seguro);

        System.out.println(calc.getTotalImposto());
    }
}