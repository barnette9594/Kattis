import java.util.Scanner;

public class ColdputerScience {

   public static void main(String[] args) {
   
      Scanner in = new Scanner(System.in);
      
      int n = 0;
      int output = 0;
      int t = 0; 
   
      n = in.nextInt();
   
      for (int i = 0; i < n; i++) {
         t = in.nextInt();
         if (t < 0) {
            output++;
         }
      
      }
   
      System.out.println(output);
   
   }

}