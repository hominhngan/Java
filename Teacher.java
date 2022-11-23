public class Teacher extends Person {
    private String subject;

    public Teacher() {
        super();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void input() {
        super.input();
        System.out.print("Nhap bo mon giang day: ");
        subject = scanner.next();
    }
}


