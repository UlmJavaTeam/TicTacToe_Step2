import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please select the developer:");
        System.out.println("press 1: Murat");
        System.out.println("press 2: Kenan");
        System.out.println("press 3: Nimetullah");
        System.out.println("press 4: Sami");

        TicTacToe ticTocToe = null;

        Scanner input = new Scanner(System.in);
        int nummer = input.nextInt();


        if (nummer == 1) ticTocToe = new TicTacToeMurat();
        else if (nummer == 2) ticTocToe = new TicTacToeKenan();
        else if (nummer == 3) ticTocToe = new TicTacToeNimetullah();
        else if (nummer == 4) ticTocToe = new TicTacToeSami();
        else System.exit(0);


        /*switch (nummer) {
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
        }*/


        int number;

        while (true) {

            //-- Player - 1
            // --  print the table
            ticTocToe.print();

            //-- get number
            number = ticTocToe.enterNummer();
            System.out.println(number);
            //- set the char
            if (ticTocToe.setChar('X', number) == false) {
                System.out.println("not allowed");
                continue;
            }

            // check winner
            if (ticTocToe.checkWinner() == true) {
                System.out.println("Player 1 won!");
                break;
            }

            //-- Player - 2
            // --  print the table
            ticTocToe.print();

            //-- get number
            number = ticTocToe.enterNummer();

            //- set the char
            if (ticTocToe.setChar('0', number) == false) {
                System.out.println("not allowed");
                continue;
            }

            // check winner
            if (ticTocToe.checkWinner() == true) {
                System.out.println("Player 2 won!");
                break;
            }
        }
    }

}

