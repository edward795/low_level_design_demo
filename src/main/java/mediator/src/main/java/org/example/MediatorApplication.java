package org.example;

public class MediatorApplication {
    public static void main(String[] args) {
        ChatMediator mediator=new ChatMediatorImpl();
        User user1=new UserImpl(mediator,"Nikhil");
        User user2=new UserImpl(mediator,"Shivam");
        User user3=new UserImpl(mediator,"Vishnu");
        User user4=new UserImpl(mediator,"Ali");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        user1.send("Subscribe to Daily Code Buffer!!");
    }
}
