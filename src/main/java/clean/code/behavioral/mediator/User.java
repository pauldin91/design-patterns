package clean.code.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class User {
    public String name;
    public ChatRoom room;
    private List<String> chatLog = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }
    public void receive(String sender,String message)
    {
        String s = sender + ":"+message;
        System.out.println("["+name+"'s chat session"+s);
        chatLog.add(s);
    }
    public void transmit(String message)
    {
        room.broadcast(name,message);
    }
    public void privateMessage(String who,String message)
    {
        room.message(name,who,message);
    }
}
