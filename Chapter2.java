import java.util.Scanner;
public class Chapter2
{
   public static void main(String[] args)
   {
      double percentage = .62;
      double sales = 460000;
      double predicition = sales * percentage;
      
      
      
      String name;
      Scanner keyboard = new Scanner(System.in);
      //name = keyboard.nextLine();
           
      
      
      
      int class1, class2, class3, class4, class5;
      int classGradeAdd = class1 + class2 + class3 + class4 + class5;
      int gpa = classGradeAdd/5;
      
      
      System.out.println("Enter the grade for la clase 1");
      class1 = keyboard.nextInt();
      
      System.out.println("Enter the grade for la clase 2");
      class2 = keyboard.nextInt();
      
      System.out.println("Enter the grade for la clase 3: ");
      class3 = keyboard.nextInt();
      
      System.out.println("Enter the grade for la clase 4:");
      class4 = keyboard.nextInt();
      
      System.out.println("Enter the grade for la clase 5:");
      class5 = keyboard.nextInt();
      
      System.out.println("Your GPA is :" + gpa + "! Good Job Dumbass");
      
            
   }
}

// FINAL for CONST 
// USE UPPER CASE FOR FINAL/CONST VARIABLES

//USER INPUT
//or whatever could be anything but bobs your uncle
// Dont forget the IMPORT JAVA.UTIL.SCANNER
// MUST HAVE NEW for SCANNER to work

// Scanner methods need to clear newLine left in memory buffer 
// Add extra keyboard.nextLine(); to clear after using anything besides STRING!!!!!
// Between switching from numberic data type to string types. 




//Lucivious BORE
