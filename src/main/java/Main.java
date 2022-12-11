import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please select the developer:");
        System.out.println("press 1: Murat");
        System.out.println("press 2: Kenan");
        System.out.println("press 3: Nimetullah");
        System.out.println("press 4: Sami");

        Scanner input = new Scanner(System.in);
        int nummer = input.nextInt();
        TicTacToe ticTocToe;
        switch (nummer) {
            case 1:
                ticTocToe = new TicTacToeMurat();
            case 2:
                ticTocToe = new TicTacToeKenan();
            case 3:
                ticTocToe = new TicTacToeNimetullah();
            case 4:
                ticTocToe = new TicTacToeSami();
            default:
                ticTocToe = new TicTacToeOzan();
        }


        int number;
        while (true) {

            //-- Player - 1
            // --  print the table
            ticTocToe.print();

            //-- get number
            number = ticTocToe.enterNummer();

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

