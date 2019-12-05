import java.util.Scanner;

public class TemperatureConversions {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double temperature;
        System.out.println("Choise temperature:" +
                " \n1-temperature fahrenheit " +
                "\n2-temperature celsius");

        int choise = input.nextInt();
        switch (choise) {
            case 1:
                System.out.println("Temperature Fahrenheit");
                temperature = input.nextDouble();
                System.out.println("Celsius equivalent is " + conversionInCelsius(temperature));
                break;
            case 2:
                System.out.println("Enter temperature in Celsius ");
                temperature = input.nextDouble();
                System.out.println("Fahrenheit equivalent is " + conversionInFahrenheit(temperature));
                break;
        }

    }

    public static double conversionInCelsius(double temperatureInFahrenheit) {
        temperatureInFahrenheit = 5.0 / 9.0 * (temperatureInFahrenheit - 32);
        return temperatureInFahrenheit;
    }

    public static double conversionInFahrenheit(double temperatureInCelsius) {
        temperatureInCelsius = 9.0 / 5.0 * temperatureInCelsius + 32;
        return temperatureInCelsius;
    }
}


