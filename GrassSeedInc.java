import java.util.Scanner;
import java.text.DecimalFormat;

public class GrassSeedInc {

   public static void main(String[] args) {
   
      Scanner in = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("#0.00000000");
   
      double seedCost = 0;
      double lawns = 0;
      double totalCost = 0;   
      
      seedCost = in.nextDouble();
      lawns = in.nextDouble();
      
      for (int i = 0; i < lawns; i++) {
         double area = in.nextDouble() * in.nextDouble();
         totalCost += (area * seedCost);           
         
      }
      
      System.out.println(df.format(totalCost));
      
      
      
      
   
    
   
   
   }
   

}
