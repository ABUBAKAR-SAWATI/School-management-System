public class FeeStructure {
    private String type; // e.g., monthly or term-wise
    private double amount;

    public FeeStructure(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public void updateStructure() {
        System.out.println("Fee structure updated");
    }
}
