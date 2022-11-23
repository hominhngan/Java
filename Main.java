import java.util.ArrayList;
import java.util.Scanner;
class Manage{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong nhan su: ");
        int sl = scanner.nextInt();
        ArrayList <Teacher> lst_teacher = new ArrayList<>();
        ArrayList <Person> lst_student = new ArrayList<>();
        ArrayList <Person> lst_another = new ArrayList<>();

        for (int i = 0; i < sl; i++) {
            System.out.println("Nhap thong tin nhan su thu " + (i + 1) + ":");
            System.out.print("1 - Giao Vien, 2 - Hoc sinh, 3 - Khac: ");
            int choose = scanner.nextInt();

            if (choose == 1) {
                Teacher teacher = new Teacher();
                teacher.input();
                lst_teacher.add(teacher);
            }

            else if (choose == 2) {
                Person student = new Student();
                student.input();
                lst_student.add(student);
            }
            else if (choose == 3){
                Person another = new Worker();
                another.input();
                lst_another.add(another);
            }
        }

        System.out.println("Ban muon in thong tin cua: ");
        System.out.print("1 - Giao Vien, 2 - Hoc sinh, 3 - Khac: ");
        int choose = scanner.nextInt();
        if (choose == 1) {
            for (Person gv : lst_teacher) {
                System.out.println(gv.toString());
            }
        }
        else if (choose == 2){
            for (Person hs : lst_student) {
                System.out.println(hs.toString());
            }
        }
        else if (choose == 3) {
            for (Person khac : lst_another){
                    System.out.println(khac.toString());
            }
        }
    }
}
