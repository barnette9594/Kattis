import java.util.Scanner;

public class Oddities {

   public static void main(String[] args) {
   
      int n;
      int n2;
      
   
      Scanner in = new Scanner(System.in);
      
   
      n = in.nextInt();
      
      
      int[] a = new int[n];
      
      
      
      
      
      for (int i = 0; i < n; ++i) {
         n2 = in.nextInt();
         if (n2 % 2 == 0) {
            System.out.println(n2 + " is even");
         } else {
            System.out.println(n2 + " is odd");
         
         }  
      }
      
      
      
   
   
   
   
   }



}