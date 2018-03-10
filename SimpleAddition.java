import java.util.Scanner;
import java.math.BigInteger;
   
public class SimpleAddition {

   public static void main(String[] args) {
   
      Scanner in = new Scanner(System.in);
      
     
      BigInteger x = new BigInteger(in.next());
      BigInteger y = new BigInteger(in.next());
      
      System.out.print(x.add(y));
     
     
     
   
   }

}