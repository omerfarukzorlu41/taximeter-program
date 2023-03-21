import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
          int  minimum=20,openingFee=10;
          double perKilometer=2.20,amount,way;

          Scanner scanner = new Scanner(System.in);
          System.out.print("how much (kilometers) did you travel?: ");
          way = scanner.nextDouble();
          amount = way*perKilometer+openingFee;
          if(amount<20){
              System.out.println("Amount to be paid: "+minimum);
          }else{
              System.out.println("Amount to be paid: "+amount);
          }
    }
}
