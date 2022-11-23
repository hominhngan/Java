import java.util.Arrays;
import java.util.Scanner;
public class parallelogram extends edge{
    Scanner input = new Scanner(System.in);
    public void cal(){
        System.out.println("So canh: ");
        canh = input.nextInt();
        int a[] = new int[canh];

        System.out.println("Nhap do dai 2 canh va duong cao: ");
        for(int i=0; i<canh; i++){
            a[i]= input.nextInt();
        }
        System.out.println("Chu vi: " + (a[0] + a[1] ) * 2);
        System.out.println("Diện tích: " + Math.max(a[0], a[1]) * a[2]);
    }
}
