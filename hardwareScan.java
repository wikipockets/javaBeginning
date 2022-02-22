import java.util.Scanner;
import java.util.*;

public class hardwareScan {
      public static void main(String[] args){
      
         Scanner Scan = new Scanner(System.in);
         
         Properties p = System.getProperties();   
         //p.list(System.out); 
         System.out.print("Total CPU:");
         System.out.println(Runtime.getRuntime().availableProcessors());
         System.out.println("Max Memory: " + Runtime.getRuntime().maxMemory() + "\n" + "available Memory: " + Runtime.getRuntime().freeMemory());
         System.out.println("Operating System: " + System.getProperty("os.name"));  
      
      }
}
