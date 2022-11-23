import java.util.Scanner;

public class Worker extends Person{
    private float wage;

    public Worker(){
        super();
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }
    public void input() {
        super.input();
        System.out.print("Nhap luong: ");
        wage = scanner.nextFloat();
    }
}
