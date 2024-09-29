package clean.code.behavioral.template;

public abstract class Game {

    protected int currentPlayer;
    protected final int numberOfPlayer;
    protected Game(int numberOfPlayer) {

        this.numberOfPlayer = numberOfPlayer;
    }
    public void run()
    {
        start();
        while(!haveWinner())
            takeTurns();
        System.out.println("Winner is :" + currentPlayer);
    }

    protected abstract void takeTurns();

    protected abstract boolean haveWinner();

    protected abstract void start();
}
