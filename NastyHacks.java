import java.util.Scanner;

public class NastyHacks {

   public static void main(String[] args) {
      
      nastyHacker();
   
   
   
   }
   
   public static void nastyHacker() {
      int n; 
      int r;
      int e;
      int c;
   
      Scanner in = new Scanner(System.in);
   
      n = in.nextInt();
   
      for (int i = 0; i < n; ++i) {
         r = in.nextInt();
         e = in.nextInt();
         c = in.nextInt();
         if (r > e - c) {
            System.out.println("do not advertise"); 
         }
         if (r < e - c) {
            System.out.println("advertise"); 
         } 
         if (r == e - c) {
            System.out.println("does not matter");
         }
                  
      
      
      }
   
   
   
   }

}
