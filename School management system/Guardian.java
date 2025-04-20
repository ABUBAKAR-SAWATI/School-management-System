public class Guardian extends Person {
    private String childName;

    public Guardian(String name, String email, String password, String childName) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.childName = childName;
    }

    @Override
    public void login() {
        System.out.println("Guardian logged in");
    }

    public void payFee() {
        System.out.println("Fee paid by Guardian");
    }

    public void viewFeeStatus() {
        System.out.println("Viewing fee status");
    }
}
