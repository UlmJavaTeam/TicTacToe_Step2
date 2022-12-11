import java.util.*;

public class TicTacToeMurat implements TicTacToe {
    private int counter;
    private ArrayList<String> selectedNumbers;
    private ArrayList<String> playerX;
    private ArrayList<String> playerO;
    private List keyNumbers;
    private char[][] gameBoard;

    public TicTacToeMurat() {

        this.counter = 2;
        this.selectedNumbers = new ArrayList<>();
        this.playerX = new ArrayList<>();
        this.playerO = new ArrayList<>();
        this.keyNumbers = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");
        this.gameBoard = new char[][]{
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
        };
    }


    @Override
    public void print() {
        for (char[] row : this.gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println("");
        }

    }

    @Override
    public int enterNummer() {
        Scanner scanner = new Scanner(System.in);
        String number = "";

        while (true) {

            System.out.println("Please choose a number between 1-9 : ");
            number = scanner.nextLine();
            if (this.keyNumbers.contains(number)) {
                break;
            }

        }

        return Integer.valueOf(number);
    }

    @Override
    public boolean setChar(char pChar, int pPos) {

        char symbol = 0;
        ArrayList<String> list = null;

        if (this.keyNumbers.contains(String.valueOf(pPos)) && !this.selectedNumbers.contains(String.valueOf(pPos))) {

            if (this.counter % 2 == 0) {
                symbol = 'X';
                list = this.playerX;
            } else if (this.counter % 2 == 1) {
                symbol = 'O';
                list = this.playerO;
            }

            if (pPos == 1) {
                this.gameBoard[0][0] = symbol;
            } else if (pPos == 2) {
                this.gameBoard[0][2] = symbol;
            } else if (pPos == 3) {
                this.gameBoard[0][4] = symbol;
            } else if (pPos == 4) {
                gameBoard[2][0] = symbol;
            } else if (pPos == 5) {
                this.gameBoard[2][2] = symbol;
            } else if (pPos == 6) {
                this.gameBoard[2][4] = symbol;
            } else if (pPos == 7) {
                this.gameBoard[4][0] = symbol;
            } else if (pPos == 8) {
                this.gameBoard[4][2] = symbol;
            } else if (pPos == 9) {
                this.gameBoard[4][4] = symbol;
            }

            list.add(String.valueOf(pPos));
            this.selectedNumbers.add(String.valueOf(pPos));

            System.out.println("Player 1's Choises : " + this.playerX);
            System.out.println("Player 2's Choises: " + this.playerO);
            this.counter++;
            return true;
        }

        System.out.println("Player 1's Choises : " + this.playerX);
        System.out.println("Player 2's Choises: " + this.playerO);
        return false;

    }


    @Override
    public boolean checkWinner() {
        String palyer = "";
        ArrayList<String> liste = null;
        if (this.counter % 2 == 1) {

            liste = this.playerX;
        } else if (this.counter % 2 == 0) {

            liste = this.playerO;
        }
        List list1 = Arrays.asList("1", "2", "3");
        List list2 = Arrays.asList("4", "5", "6");
        List list3 = Arrays.asList("7", "8", "9");
        List list4 = Arrays.asList("1", "4", "7");
        List list5 = Arrays.asList("2", "5", "8");
        List list6 = Arrays.asList("3", "6", "9");
        List list7 = Arrays.asList("1", "5", "9");
        List list8 = Arrays.asList("3", "5", "7");
        List list9 = Arrays.asList("3", "2", "1");
        List list10 = Arrays.asList("6", "5", "4");
        List list11 = Arrays.asList("9", "8", "7");
        List list12 = Arrays.asList("7", "4", "1");
        List list13 = Arrays.asList("8", "5", "2");
        List list14 = Arrays.asList("9", "6", "3");
        List list15 = Arrays.asList("9", "5", "1");
        List list16 = Arrays.asList("7", "5", "3");


        List<List> winner = new ArrayList<List>();
        winner.add(list1);
        winner.add(list2);
        winner.add(list3);
        winner.add(list4);
        winner.add(list5);
        winner.add(list6);
        winner.add(list7);
        winner.add(list8);
        winner.add(list9);
        winner.add(list10);
        winner.add(list11);
        winner.add(list12);
        winner.add(list13);
        winner.add(list14);
        winner.add(list15);
        winner.add(list16);

        // Checking if the player's list is in the big list.
        for (List k : winner) {
            if (liste.containsAll(k)) {
                print();
                return true;
            }
        }
        if(this.selectedNumbers.size()==9){
            print();
            System.out.println("No winner !");
            System.exit(0);
        }
        if (this.counter % 2 == 1) {
            System.out.println("Player 1 has played! Order : Player 2");

        } else if (this.counter % 2 == 0) {
            System.out.println("Player 2 has played! Order : Player 1");
        }
        return false;
    }
}






