public class Payment {
    private double amount;
    private String date;
    private String method;

    public Payment(double amount, String date, String method) {
        this.amount = amount;
        this.date = date;
        this.method = method;
    }

    public void generateReceipt() {
        System.out.println("Receipt generated");
    }
}
