
import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Radius of a circle ");
        double radius = input.nextDouble();

        System.out.println("Area of a circle is " + circleArea(radius));
    }

    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}