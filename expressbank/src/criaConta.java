public class criaConta {
    
    public static void main(String[] args) {
        Conta primeirConta = new Conta();
        primeirConta. saldo = 200;
        System.out.println(primeirConta);

        primeirConta.saldo += 100;
        System.out.println(primeirConta);

        Conta segundConta= new Conta();
        segundConta.saldo = 50;

        System.out.println("Primeira conta tem "+ primeirConta);
        System.out.println("Segunda conta tem " + segundConta);

        System.out.println("referenciar: " + primeirConta);


    }
}

