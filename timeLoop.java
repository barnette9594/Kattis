import java.util.Scanner;

public class timeLoop {

   public static void main(String[] args) {
   
      Scanner in = new Scanner(System.in);
   
      int user;
      
      user = in.nextInt();
   
      int[] a = new int[user];
      
      
      for (user = 0; user < a.length; user++) {
         System.out.println(user + 1 + " abracadabra");
      }
   
   }

}
