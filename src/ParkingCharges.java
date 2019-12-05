import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many customers are in parking?");
        int customers = input.nextInt();
        double yesterdayParking = 0;
        double temp = 0;

        for (int i = 0; i < customers; i++) {
            System.out.println("How many temp is customers" + (i + 1) + " in the parking?");
            double hoursParked = input.nextDouble();
            System.out.println(calculateCharges(Math.ceil(hoursParked)));
            yesterdayParking = calculateCharges(Math.ceil(hoursParked));
            temp += yesterdayParking;

        }
        System.out.println("Total of yesterday's parking is " + temp);
    }

    public static double calculateCharges(double hoursParking) {
        double price = 0.0;
        if (hoursParking <= 3)
            price = 2;
        if (hoursParking > 3)
            price = 2 + (hoursParking - 3) * 0.5;
        if (price > 10)
            price = 10;
        return price;
    }
}