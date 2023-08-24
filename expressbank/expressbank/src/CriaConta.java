public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new ContaCorrente(0, 0);
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new ContaPoupanca(0, 0);
        segundaConta.saldo = 50;

        System.out.println("primeira conta tem " + primeiraConta.saldo);
        System.out.println("segunda conta tem " + segundaConta.saldo);

        System.out.println("referenciar: " + primeiraConta);
    }

}