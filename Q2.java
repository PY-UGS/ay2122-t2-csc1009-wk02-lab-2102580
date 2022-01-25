import java.util.Scanner;
 
public class Q2 {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Enter three numbers: ");
  double num1 = in.nextDouble();
   
  
  double num2 = in.nextDouble();
   
  
  double num3 = in.nextDouble();
   
   
   
  System.out.println("The average of " + num1 + " " + num2 + " " + num3 + " is " + 
   (num1 + num2 + num3 ) / 3);

   in.close();
 }
}
