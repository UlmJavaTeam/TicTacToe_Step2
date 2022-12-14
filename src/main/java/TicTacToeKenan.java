import java.util.Scanner;

public class TicTacToeKenan implements TicTacToe {

    private char[][] matrix = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
    private String iteratinoncontroll = "f";
    private int count = 0;

    public void muster() {
        char[][] matrix1 = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
        this.matrix = matrix1;
        this.iteratinoncontroll = "f";
        this.count = 0;
    }

    @Override
    public void print() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public int enterNummer() {
        int nummer = 0;
        System.out.println("enter a nummer");
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                nummer = input.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("please enter a nummer!!");
                continue;
            }
        }
        return nummer;
    }

    @Override
    public boolean setChar(char pChar, int pPos) {
        String userInput1 = String.valueOf(pPos);
        while (true) {
            if (this.iteratinoncontroll.contains(userInput1)) {
                System.out.println("please do not select the previously selected number");
                return false;
            } else {

                switch (pPos) {
                    case 1:
                        matrix[0][0] = pChar;
                        break;
                    case 2:
                        matrix[0][1] = pChar;
                        break;
                    case 3:
                        matrix[0][2] = pChar;
                        break;
                    case 4:
                        matrix[1][0] = pChar;
                        break;
                    case 5:
                        matrix[1][1] = pChar;
                        break;
                    case 6:
                        matrix[1][2] = pChar;
                        break;
                    case 7:
                        matrix[2][0] = pChar;
                        break;
                    case 8:
                        matrix[2][1] = pChar;
                        break;
                    case 9:
                        matrix[2][2] = pChar;
                        break;
                    default:
                        System.out.println("you entered a number greater than nine");
                        return false;
                }
                break;
            }
        }
        this.iteratinoncontroll = this.iteratinoncontroll + userInput1;
        count++;
        return true;
    }

    @Override
    public boolean checkWinner() {
        String testX = "XXX", testO = "000";
        String word1 = "" + matrix[0][0] + matrix[0][1] + matrix[0][2];
        String word2 = "" + matrix[1][0] + matrix[1][1] + matrix[1][2];
        String word3 = "" + matrix[2][0] + matrix[2][1] + matrix[2][2];
        String word4 = "" + matrix[0][0] + matrix[1][0] + matrix[2][0];
        String word5 = "" + matrix[0][1] + matrix[1][1] + matrix[2][1];
        String word6 = "" + matrix[0][2] + matrix[1][2] + matrix[2][2];
        String word7 = "" + matrix[0][0] + matrix[1][1] + matrix[2][2];
        String word8 = "" + matrix[0][2] + matrix[1][1] + matrix[2][0];

        if (testX.equals(word1) || testX.equals(word2) || testX.equals(word3) || testX.equals(word4) || testX.equals(word5) || testX.equals(word6) || testX.equals(word7) || testX.equals(word8)) {
            System.out.println("Winner XXX");
            return true;
        } else if (testO.equals(word1) || testO.equals(word2) || testO.equals(word3) || testO.equals(word4) || testO.equals(word5) || testO.equals(word6) || testO.equals(word7) || testO.equals(word8)) {
            System.out.println("Winner 000");
            return true;
        } else if (this.count == 9) {
            System.out.println("No Winner!!");
            muster();
            System.out.println("new game");
            return false;
        } else
            return false;
    }
}