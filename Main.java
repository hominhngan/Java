import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int choose = scanner.nextInt();
        System.out.println("Chu vi, dien tich cua: ");
        System.out.println("1 - retangle");
        System.out.println("2 - square");
        System.out.println("3 - triangle");
        System.out.println("4 - parallelogram");
            if (choose==1)
            {
                rectangle H = new rectangle();
                H.cal();
            }
            else if (choose==2)
            {
                square H = new square();
                H.cal();
            }
            else if (choose==3)
             {
                triangle H = new triangle();
                H.cal();
            }
            else
            {
                parallelogram H = new parallelogram();
                H.cal();
            }
        }
    }