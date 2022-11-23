import java.util.Arrays;
import java.util.Scanner;
public class triangle extends edge{
    Scanner input = new Scanner(System.in);
    public void cal(){
        System.out.println("So canh: ");
        canh = input.nextInt();
        double a[] = new double[canh];
        double p=0, s=1;
        System.out.println("Nhap do dai cac canh: ");
        for(int i=0; i<canh; i++){
            a[i]= input.nextDouble();
            p+=a[i];
        }
        p = p/2;
        s = Math.sqrt(p * (p - a[0]) * (p - a[1]) * (p - a[2]));
        System.out.println("Chu vi: " + (a[0]+a[1]+a[2]));
        System.out.println("Dien tich: " + s);
    }
}
