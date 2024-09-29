package clean.code.behavioral.template;

public class Chess extends Game{
    private int maxTurns=10;
    private int turn=1;

    public Chess() {
        super(2);
    }

    @Override
    protected void takeTurns() {
        System.out.println("Turn "+turn+++" taken by "+currentPlayer);
        currentPlayer=(currentPlayer+1)%numberOfPlayer;
    }

    @Override
    protected boolean haveWinner() {
        return turn==maxTurns;
    }

    @Override
    protected void start() {

    }
}
