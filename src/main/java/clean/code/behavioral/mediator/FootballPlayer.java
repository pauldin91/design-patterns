package clean.code.behavioral.mediator;

public class FootballPlayer {
    private int goalsScored;
    private EventBroker broker;
    private String name;

    public FootballPlayer(EventBroker broker, String name) {

        this.broker = broker;
        this.name = name;
    }
    public void score(){
        broker.publish(++goalsScored);
    }

}
