public interface TicTacToe {

    /**
     * print the table
     **/
    public void print();

    /**
     * read the number from current user
     **/
    public int enterNummer();

    /**
     * set the char at the position @pNumber
     **/
    public boolean setChar(char pChar, int pPos);

    /**
    * check the winner
    **/
    public boolean checkWinner();

}
