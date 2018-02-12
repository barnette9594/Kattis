import java.util.Scanner;

public class OneChickPerPerson {

   public static void main(String[] args) {
   
      Scanner in = new Scanner(System.in);
      int N = in.nextInt();
      int M = in.nextInt();
      int ckn = N - M;
   
      if (N > M) {
         if (ckn == 1) {
            System.out.println("Dr. Chaz needs " + Math.abs(ckn) + " more piece of chicken!");
         } else {
            System.out.println("Dr. Chaz needs " + Math.abs(ckn) + " more pieces of chicken!");
         }
      }
      
      if (N < M) {
         if (ckn == -1) {
            System.out.println("Dr. Chaz will have " + Math.abs(ckn) + " piece of chicken left over!");
         } else {
            System.out.println("Dr. Chaz will have " + Math.abs(ckn) + " pieces of chicken left over!");
         }
      }
   
              
   
   
   
       
      
               
     
   }




}
