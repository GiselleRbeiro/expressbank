public class criaConta {
    
    public static void main (String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 300;

        System.out.println("Primeira conta tem " + primeiraConta.saldo);
        System.out.println("Segunda conta tem " + segundaConta.saldo);

        primeiraConta.agencia = 146;
        System.out.println( primeiraConta.agencia);
        System.out.println(primeiraConta.numero);

        segundaConta.agencia = 146;
        System.out.println("Agora a segunda conta está " + segundaConta.agencia);

        if (primeiraConta == segundaConta){
            System.out.println("mesma conta");
        
        } else {
            System.out.println("Contas diferentes");
        }
        System.out.println(primeiraConta);
        System.out.println(segundaConta);

        }
    }

