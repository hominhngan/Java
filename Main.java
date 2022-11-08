import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        System.out.println("Nhap so sinh vien: ");
        int n = scanner.nextInt();
        for(int i = 0; i< n; i++){
            Student student = new Student();
            student.input();
            students.add(student);
        }
        for(int i = 0; i< n; i++){
            students.get(i).output();
        }

    }
}