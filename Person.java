import java.util.Scanner;
public class Person {
    Scanner scanner = new Scanner(System.in);
    String name, id;
    int age;

    public Person() {
    }

    public Person(Scanner scanner, String name, String id, int age) {
        this.scanner = scanner;
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void input(){
        System.out.print("Nhap ho ten:  ");
        name = scanner.nextLine();
        System.out.print("Nhap tuoi:  ");
        age = scanner.nextInt();
        System.out.print("Nhap id: ");
        id = scanner.next();
    }

    public String toString() {
        return "Person [scanner=" + scanner + ", Ho ten =" + name + ", CCCD=" + id + ", tuoi=" + age + "]";
    }
}
