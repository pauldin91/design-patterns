package behavioral;

import clean.code.behavioral.mediator.*;
import org.junit.jupiter.api.Test;

public class MediatorTests {
    @Test
    public void chatRoomTests()
    {
        ChatRoom room = new ChatRoom();
        User john = new User("John");
        User jane = new User("Jane");
        room.join(john);
        room.join(jane);
        john.transmit("hello all");
        jane.transmit("all hello");
    }

    @Test
    public void brokerTests()
    {
        EventBroker ev = new EventBroker();
        FootballPlayer fp = new FootballPlayer(ev,"Ubab");
        FootballCoach ch = new FootballCoach(ev);
        fp.score();
        fp.score();

    }

}
