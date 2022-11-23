import java.util.Arrays;
import java.util.Scanner;
public class square extends edge{
    Scanner input = new Scanner(System.in);
    public void cal(){
        System.out.println("So canh: ");
        canh = input.nextInt();
        int a[] = new int[canh];

        System.out.println("Nhap do dai cac canh: ");
        for(int i=0; i<canh; i++){
            a[i]= input.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Chu vi: " + a[0]*4);
        System.out.println("Diện tích: " + a[0]*a[0]);
    }
}

