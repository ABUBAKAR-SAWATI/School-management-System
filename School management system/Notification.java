public class Notification {
    private String message;
    private String type;

    public Notification(String message, String type) {
        this.message = message;
        this.type = type;
    }

    public void send() {
        System.out.println("Notification sent: " + message);
    }
}
