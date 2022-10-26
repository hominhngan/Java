import java.util.Scanner;
public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //hinh vuong
        Square square = new Square();
        System.out.println("Nhap do dai canh hinh vuong: ");
        square.x = scanner.nextFloat();
        System.out.println("Chu vi hinh vuong: " + square.perimeter());
        System.out.println("Dien tich hinh vuong: " + square.area());

        //hinh binh hanh
        Parallelogram parallelogram = new Parallelogram();
        System.out.println("Nhap do dai 2 canh hinh binh hanh: ");
        parallelogram.x = scanner.nextFloat();
        parallelogram.y = scanner.nextFloat();
        System.out.println("Nhap vao chieu cao: ");
        parallelogram.h = scanner.nextFloat();
        System.out.println("Chu vi hinh binh hanh: " + parallelogram.perimeter());
        System.out.println("Dien tich hinh binh hanh: " + parallelogram.area());

        //hinh hop chu nhat
        Rectangular rectangular = new Rectangular();
        System.out.print("Nhap vao do dai 2 canh day: ");
        rectangular.x = scanner.nextFloat();
        rectangular.y = scanner.nextFloat();
        System.out.println("Nhap vao chieu cao: ");
        rectangular.h = scanner.nextFloat();
        System.out.println("Chu vi hinh hop chu nhat: " + rectangular.perimeter());
        System.out.println("Dien tich toan phan hinh hop chu nhat: " + rectangular.area());

        //hinh tam giac
        Triangle triangle = new Triangle();
        System.out.println("Nhap vao do dai 3 canh tam giac: ");
        triangle.a = scanner.nextFloat();
        triangle.b = scanner.nextFloat();
        triangle.c = scanner.nextFloat();
        if (triangle.check()) {
            System.out.println("Chu vi hinh tam giac: " + triangle.perimeter());
            System.out.println("Dien tich hinh tam giac: " + triangle.area());
        } else {
            System.out.println("Day khong phai la hinh tam giac");
        }

        //hinh thoi
        Rhombus rhombus = new Rhombus();
        System.out.println("Nhap vao do dai 2 duong cheo hinh thoi: ");
        rhombus.x = scanner.nextFloat();
        rhombus.y = scanner.nextFloat();
        System.out.println("Chu vi hinh thoi: " + rhombus.perimeter());
        System.out.println("Dien tich hinh thoi: " + rhombus.area());

    }
}