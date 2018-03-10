import java.util.Scanner;
import java.lang.Math;


public class CompassCalc {

   public static void main(String[] args) {
   
      Scanner in = new Scanner(System.in);
   
      int n1 = in.nextInt();
      int n2 = in.nextInt();
   
      int poss1 = (n2 - n1 + 720) % 360;
      int poss2 = -1 * (n1 - n2 + 720) % 360;
   
      if (Math.abs(poss1) == 180) {
         System.out.print(180);
      } else if (Math.abs(poss1) < Math.abs(poss2)) {
         System.out.print(poss1);
      } else
         System.out.print(poss2);
   }


}
