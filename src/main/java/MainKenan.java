import java.util.Scanner;

public class MainKenan {
    public static void main(String[] args) {

        System.out.println("Please select the developer:");
        System.out.println("press 1: Murat");
        System.out.println("press 2: Kenan");
        System.out.println("press 3: Nimetullah");
        System.out.println("press 4: Sami");

        TicTacToe ticTocToe = null;

        Scanner input = new Scanner(System.in);
        int nummer = input.nextInt();

        switch (nummer) {
            case 1:
                ticTocToe = new TicTacToeMurat();
                break;
            case 2:
                ticTocToe = new TicTacToeKenan();
                break;
            case 3:
                ticTocToe = new TicTacToeNimetullah();
                break;
            case 4:
                ticTocToe = new TicTacToeSami();
                break;
            default:
                ticTocToe = new TicTacToeOzan();
                break;
        }


        int number;
        int count = 1;
        while (true) {

            ticTocToe.print();
            number = ticTocToe.enterNummer();

            if (count % 2 == 1) {
                if (ticTocToe.setChar('X', number)) {
                    count++;
                }
                if (ticTocToe.checkWinner()) {
                    System.out.println("player 1 Winner");
                    ticTocToe.print();
                    break;
                } else
                    continue;
            } else if (count % 2 == 0) {
                if (ticTocToe.setChar('0', number)) {
                    count++;
                }
                if (ticTocToe.checkWinner()) {
                    System.out.println("player 2 Winner");
                    ticTocToe.print();
                    break;
                } else
                    continue;
            }
            break;
        }
    }
}
