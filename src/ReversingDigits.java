import java.util.Scanner;

public class ReversingDigits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println("Reversed Number: " + getReversed(num));
    }

    public static int getReversed(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;

    }
}
