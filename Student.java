import java.util.Scanner;

public class Student extends Person{
    private String class_;
    public Student() {
        super();
    }

    public String getClass_() {
        return class_;
    }

    public void setClass_(String class_) {
        this.class_ = class_;
    }
    public void input() {
        super.input();
        System.out.print("Nhap lop: ");
        class_ = scanner.next();
    }

}
