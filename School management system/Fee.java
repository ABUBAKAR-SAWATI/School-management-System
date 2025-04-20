public class Fee {
    private double amount;
    private String dueDate;
    private boolean isPaid;

    public Fee(double amount, String dueDate) {
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    public void markAsPaid() {
        isPaid = true;
    }

    public boolean isFeePaid() {
        return isPaid;
    }
}
