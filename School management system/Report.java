public class Report {
    private String content;

    public Report(String content) {
        this.content = content;
    }

    public void generate() {
        System.out.println("Report generated: " + content);
    }
}
