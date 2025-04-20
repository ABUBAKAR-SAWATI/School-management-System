public class SchoolAdmin extends Person {

    public SchoolAdmin(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    @Override
    public void login() {
        System.out.println("Admin logged in");
    }

    public void setupFeeStructure() {
        System.out.println("Fee structure set");
    }

    public void sendReminders() {
        System.out.println("Payment reminders sent");
    }

    public void viewReports() {
        System.out.println("Viewing reports");
    }
}
