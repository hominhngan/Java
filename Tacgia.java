import java.util.ArrayList;
import java.util.Scanner;

public class Tacgia {
    Scanner input = new Scanner(System.in);
    private String name;


    public Tacgia() {
    }

    public Tacgia(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void input(ArrayList<Tacgia>l_Author) {
        System.out.println("Nhập tên tác giả: ");
        name = input.nextLine ();
    }
}
