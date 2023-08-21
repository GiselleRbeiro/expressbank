//Manager é uma extensao de  Employee
public class Engineer extends Employee { 
  
   
     public double getbenefit() {
        System.out.println("Chamando o método de bonificação do engenheiro: ");
        return super.getbenefit() + 100;

    }
}
