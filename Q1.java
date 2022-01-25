import java.util.Scanner;

public class Q1
{
    public static final double PI = 3.14159;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        double radius = in.nextDouble();
        double a = radius*radius*PI;
        System.out.print("The area for the circle of radius "+ radius + " is " + a);
        in.close();
    }
}