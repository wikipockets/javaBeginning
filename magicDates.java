import java.util.Scanner;
import java.util.*;

public class magicDates {
      public static void main(String[] args){
      
         Scanner Scan = new Scanner(System.in);
         int month, day, year, magic;
         
         System.out.print("Please Enter the Number of a Month: ");
         month = Scan.nextInt();
         
         System.out.print("Please Enter the Day: ");
         day = Scan.nextInt();
          
         System.out.print("Please Enter the last two digits of a Year: ");
         year = Scan.nextInt();
         
         magic = month * day;
         
         if (magic == year){
         
         System.out.println("The date is MaGiC~!");
         }
         
         else {
         
         System.out.println("\n" + "Better call Disney Cause this date ain't Magic");
         
         }
         
          
      }
}
