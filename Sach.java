import java.util.Scanner;

public class Sach {
    Scanner input = new Scanner(System.in);
    private String name;
    private String trangthai;
    private String tacgia;

    public Sach() {
    }

    public Sach(String name, String trangthai, String tacgia) {
        this.name = name;
        this.trangthai = trangthai;
        this.tacgia = tacgia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public void input () {
        System.out.println("Nhập tên sách: ");
        name = input.nextLine();
        System.out.println("Nhập trạng thái: ");
        trangthai = input.nextLine();
        System.out.println("Tên tác giả: ");
        tacgia = input.nextLine();
    }

    public void display () {
        System.out.println(toString());
    }
    public String toString() {
        return "Books " + input + ", status=" + trangthai
                + ", author=" + tacgia;
    }
}

