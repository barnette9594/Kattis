import java.util.Scanner;

public class LeftBeehind {

   public static void main(String[] args) {
   
      Scanner in = new Scanner(System.in);
   
      int z = 1;
         
      while (z == 1) {
        
         int x = 0,y = 0;
      
         x = in.nextInt();
         y = in.nextInt();
         
         if (x == 0 && y ==0) {
            break;
         }else if (x + y == 13) {
            System.out.println("Never speak again.");
         } else if (x > y) {
            System.out.println("To the convention.");
         } else if (x < y) {
            System.out.println("Left beehind.");
         } else if (x == y) {
            System.out.println("Undecided.");
         } else {
            System.out.println("error");
         }
       
      }
      return ;
   
      
   
   
   }
   
  

}