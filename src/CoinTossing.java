import java.util.*;

public class CoinTossing {
    private enum Coin { HEADS, TAILS };
    private static final Random randomNumbers = new Random();
    private static final int HEAD = 1;
    private static final int TAIL = 2;

    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );
        int choice;
        int frontflip = 0;
        int backflip = 0;

        Coin gameStatus = null;

        System.out.println("Choose from the menu option?");
        System.out.print("1. Toss the coin\n2. Quit program\n");
        choice = input.nextInt();

        while ( choice != 0 ) {
            if ( choice == 1 ) {
                int CoinTossed = Flip();

                switch ( CoinTossed ) {
                    case HEAD:
                        gameStatus = Coin.HEADS;
                        System.out.println("GameStatus: " + gameStatus);
                        break;
                    case TAIL:
                        gameStatus = Coin.TAILS;
                        System.out.println("GameStatus: " + gameStatus);
                        break;
                }

                if ( gameStatus == Coin.HEADS ) {
                    frontflip++; }
                else
                    backflip++;
            }
            if ( choice == 2 ) {
                EndProgram( frontflip, backflip );
            }
            System.out.println("\nChoose from the menu option.");
            System.out.print("1. Toss the coin\n2. Quit program\n");
            choice = input.nextInt();
        }
    }

    public static int Flip() {
        int toss;
        toss = 1 + randomNumbers.nextInt(2);
        return toss;
    }

    public static void EndProgram( int frontflip, int backflip) {
        System.out.printf("All those tosses: %d  heads,%d tails.\n", frontflip, backflip);
        System.exit(0);
    }
}