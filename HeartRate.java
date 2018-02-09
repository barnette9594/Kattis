import java.util.Scanner;
import java.text.DecimalFormat;

public class HeartRate {

   public static void main(String[] args) {
   
      Scanner in = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("##0.0000");
   
      double n = in.nextDouble();
      
      
      for (int i = 0; i < n; i++) {
      
         double b = in.nextDouble();
         double p = in.nextDouble();
         double bpm = 60.0 * b / p;
      
         double x = 60.0 / p; 
         System.out.println(df.format(bpm - x) + " " 
            + df.format(bpm) + " " + df.format(bpm + x));
         
      }
     
              
      
   }

}
