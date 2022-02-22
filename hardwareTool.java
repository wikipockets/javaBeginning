import java.util.Scanner;


public class hardwareTool {
      public static void main(String[] args){
      
         Scanner Scan = new Scanner(System.in);
         int CPU,GPU,Cores;
         
         System.out.print("Please enter your Graphics Processing Unit (GPU) clock speed (in Megahertz): " + "\n");
         
         GPU = Scan.nextInt();
         
         System.out.print("Please enter your Central Processing Unit (CPU) clock speed (in Megahertz): " + "\n");
         
         CPU = Scan.nextInt();
         
         System.out.print("Please enter the number of Cores your CPU has: " + "\n");
         
         Cores = Scan.nextInt();
         
         System.out.print("Computer Hardware Graphics Quality Recommendation Tool" + "\n" + "\n");
         
         //t = Scan.nextInt();
         System.out.print("GPU Clock Speed: " + GPU + " Megahertz" + "\n");
         System.out.print("CPU Clock Speed: " + CPU + " Megahertz" + "\n");        
         System.out.print("CPU Cores: " + Cores);
         //System.out.printf("The Amount of money after " + t + " years will be: $%,.2f",A );      
      }
}
