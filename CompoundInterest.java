import java.util.Scanner;


public class CompoundInterest {
      public static void main(String[] args){
      
         Scanner Scan = new Scanner(System.in);
         double A,P,r,n,t,rP, trA;
         
         System.out.print("Please enter the Principle amount: ");
         
         P = Scan.nextDouble();
         
         System.out.print("Please enter the annual interest rate: ");
         
         r = Scan.nextDouble();
         
         rP = r/100;
         
         System.out.print("Please enter the number of times per year that the interst is compounded: ");
         
         n = Scan.nextDouble();
         
         System.out.print("Please enter the number of years the account will be left to compound: ");
         
         t = Scan.nextDouble();
         
         A = P*Math.pow(1+(rP/n),n*t);
         
         
         System.out.printf("The Amount of money after " + t + " years will be: $%,.2f",A );      
      }
}
