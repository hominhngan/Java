import java.util.Scanner;
public class Brand {

    Scanner scanner = new Scanner(System.in);

    private String name;

    public Brand(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void input() {
        System.out.println("Nhập hãng linh kiện: ");
        setName(scanner.nextLine());
    }
}