
import java.util.Scanner;

class SquareOfAsterisks {
    public static void main(String args[]) {
        int size;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of a square :");
        size = input.nextInt();
        System.out.println("Enter char :");
        char fill = input.next().charAt(0);
        print_rectangle(size, size, fill);

    }


    static void print_rectangle(int n, int m, char fill) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= m; j++) {

                if (i == 1 || i == n ||
                        j == 1 || j == m)
                    System.out.printf("%c", fill);
                else
                    System.out.printf("%c", fill);
            }
            System.out.println();
        }

    }


}