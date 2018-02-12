import java.util.Scanner;

public class Aaah {

   public static void main(String[] args) {
   
      Scanner in = new Scanner(System.in);
   
      String input = "";
      String input2 = "";
      String output = "";
   
      input = in.nextLine(); 
      input2 = in.nextLine();
      
      int compare = input.compareToIgnoreCase(input2);
      
      if (compare < 0) {
         System.out.println("go");
      } else if (compare > 0) {
         System.out.println("no");
      } else {
         System.out.println("go");
      }
    
   }

}