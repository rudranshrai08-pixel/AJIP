interface Message {
    void displayMsg();
     default void displayMsg(String msg) {
        System.out.println("Default message: " + msg);
    }
    static void displayStaticMsg() {
        System.out.println("This is a display info ");
    }
    private void displayPrivateMsg() {
        System.out.println("msg");
    }
}

class DisplayMessage implements Message {
    public void displayMsg() {
        System.out.println("This is main display method");
    }

    @Override
    public void displayMsg(String msg) {
        System.out.println("Overridden message: " + msg);
    }
}

public class MainInter {
    public static void main(String[] args) {
        DisplayMessage dm = new DisplayMessage();
        dm.displayMsg();
        dm.displayMsg("This is second message");
        Message.displayStaticMsg();

        
    }
}
