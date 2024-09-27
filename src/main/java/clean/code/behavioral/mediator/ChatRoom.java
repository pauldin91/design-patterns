package clean.code.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    private List<User> people = new ArrayList<>();
    public void broadcast(String source,String message)
    {
        for(User user:people)
            if(!user.name.equals(source))
                user.receive(source,message);
    }
    public void join(User p)
    {
        String joined = p.name+" joined the room";
        broadcast("room",joined);
        p.room = this;
        people.add(p);
    }
    public void message(String source,String dest,String message)
    {
        people.stream()
                .filter(p->p.name.equals(dest))
                .findFirst()
                .ifPresent(person->person.receive(source,message));

    }
}
