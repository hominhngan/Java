import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    static Scanner input = new Scanner(System.in);
    static void command() {
        System.out.println("An 1 de nhap thong tin sach");
        System.out.println("An 2 de in thong tin sach");
        System.out.println("An 3 de nhap thong tin tac gia");
        System.out.println("An 4 de in thong tin tac gia");
        System.out.println("An 5 de ket thuc");
    }
    public static void main(String[] args){
        ArrayList<Sach> l_book = new ArrayList<>();
        ArrayList<Tacgia> l_author = new ArrayList<>();
        System.out.println("Nhap 1 de bat dau");
        int cmd = Integer.parseInt(input.nextLine());
        while (cmd != 5) {
            command();
            cmd = Integer.parseInt(input.nextLine());
            if (cmd == 1) {
                System.out.println("So sach can nhap: ");
                int sach = Integer.parseInt(input.nextLine());
                    int check = 0;
                    for (int i = 0; i < sach; i++){
                        Sach book = new Sach();
                        book.input();

                    for (int j = 0; j < l_author.size(); j++) {
                        if (l_author.get(j).getName().equals(book.getName())) {
                            check = 1;
                            break;
                        }
                    }

                    if (check == 0) {
                        Tacgia author = new Tacgia ();
                        l_author.add(author);
                    }
                    l_book.add(book);
                }
            }
            else if (cmd == 2) {
                for (Sach ttsach : l_book) {
                    ttsach.display();
                }
            }
            else if (cmd == 3) {
                System.out.println("So tac gia can nhap:  ");
                int tac_Gia = Integer.parseInt(input.nextLine());
                for (int i = 0; i < tac_Gia; i++) {
                    Tacgia author = new Tacgia();
                    author.input(l_author);
                }
            }
            else if (cmd == 4) {
                System.out.println("Ten tac gia muon tim: ");
                String ten_tg = input.nextLine();

                    for (int i = 0; i < l_book.size(); i++) {
                        if (l_book.get(i).getName().equals(ten_tg)) {
                            l_book.get(i).display();
                         }
                        else {
                            System.out.println("Khong ton tai");
                    }
                }
            }
            else if (cmd == 5) {
                System.out.println("Ket thuc");
            }
        }
        System.out.println(l_book.size());
    }
}