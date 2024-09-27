package clean.code.behavioral.mediator;

public class FootballCoach {
    

    public FootballCoach(EventBroker broker) {
       broker.subscribe(i->{
           System.out.println("Good job");
       });
    }
}
