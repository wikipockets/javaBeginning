import java.util.Scanner;
import java.util.*;

public class isp {
   public static void main(String[] args){
      
      Scanner Scan = new Scanner(System.in);
         
      double A,B,C;
      String package1;
      int hoursUsed;
      double monthCost = 0;
         
         //String name1, name2;
         
         /*
         double A = 9.95 + ((hoursUsed - 10) * 2);
         double B = 13.95 + ((hoursUsed - 20) * 1);
         double C = 19.95; 
         */
        //TODO ADD SAVINGS calculation for Vs plan C 
         
      System.out.println("Please enter the package that you have purchased (A, B, or C): ") ;
      package1 = Scan.next();
         /*
         if (Scan != A|a|B|b|C|c){
            System.out.println("Please enter a correct package");
         }
         */
      System.out.println("Please enter how many hours you've used last month (in whole hours): ");
      hoursUsed = Scan.nextInt();
         
      switch (package1){
         case "A":
            case "a":
            if ( hoursUsed > 10) {
               monthCost = 9.95 + ((hoursUsed - 10) * 1);
               break;}
            else {
               monthCost  = 9.95;
               break;
            }
               
               
               //monthCost = 9.95 + ((hoursUsed - 10) * 2);
               //add edge for under hours used IF statement inside cases
               //break;
         case "B":
            case "b": 
            if ( hoursUsed > 20) {
               monthCost = 13.95 + ((hoursUsed - 20) * 1);
               break;}
            else {
               monthCost  = 13.95;
               break;
            }
         case "C":
            case "c":
            monthCost = 19.95;
            break;
                
         default: package1 = "Enter a correct package selection";
            break;
      }
            
      System.out.printf("Your Internet Bill is : $ %.2f", monthCost);
            
      if (monthCost > 19.95) {
         System.out.println("");
         System.out.printf("You could have saved: $%.2f by switching to package C", (monthCost - 19.95));
         //System.out.printf("You could have saved: $ %.2f", (monthCost - 19.95));
         //System.out.println( " by using Package C");
      }
         
         /*
         if (name1.equalsIgnoreCase(name2)){
         
         System.out.println("Whoa its MaGiC~!");
         }
         
         else {
         
         System.out.println("Better call Disney Cause this shit ain't Magic");
         
         }
         */
         
          
   }
}
