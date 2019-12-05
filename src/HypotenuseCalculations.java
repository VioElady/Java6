
import java.util.Scanner;

public class HypotenuseCalculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first side of triangle");
        double firstSide = input.nextDouble();
        System.out.println("Enter second side of triangle");
        double secondSide = input.nextDouble();

        System.out.println("\nLength of hypotenuse is "+ getHypotenuse(firstSide, secondSide));
        System.out.println("\nLength of hypotenuse is "+ calculateHypotenuse(firstSide, secondSide));

    }

    public static double getHypotenuse(double firstSide, double secondSide) {
        return Math.hypot(firstSide, secondSide);
    }

    public static double calculateHypotenuse(double firstSide, double secondSide) {
        return Math.sqrt(Math.pow(firstSide, 2) + Math.pow(secondSide, 2));
    }
}