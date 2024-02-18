
public class Main {

    public static void main(String[] args) {

    MessagingService chat = new MessagingService();
    Message message1 = new Message("Dan", "Hi!");
    chat.add(message1);
    Message message2 = new Message("Dan", "How are you?");
    chat.add(message2);

    System.out.println(chat.getMessages());
    }
}
