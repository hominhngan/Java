import java.util.Scanner;
public class Student{
     private String name;
     private int age;
     private String _class;
     private double math, physics, chemistry;

    public Student() {
    }

    public Student(String name, int age, String _class, double math, double physics, double chemistry) {
  //      this(); //Student()
        this.name = name;
        this.age = age;
        this._class = _class;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public double averageScore(){
        return (this.math + this.physics + this.chemistry)/3;
    }
    public Student increasePoint(){
        this.math+=1;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhysics() {
        return physics;
    }

    public void setPhysics(double physics) {
        this.physics = physics;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten sv: ");
   //     String svName = scanner.nextLine();
    //    setName(scanner.nextLine());
        setName(scanner.nextLine());
        System.out.println("Nhap tuoi: ");
        setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhap lop: ");
        set_class(scanner.nextLine());
        System.out.println("Nhap diem toan: ");
        setMath(Double.parseDouble(String.valueOf(scanner.nextDouble())));
        System.out.println("Nhap diem ly: ");
        setPhysics(Double.parseDouble(String.valueOf(scanner.nextDouble())));
        System.out.println("Nhap diem hoa: ");
        setChemistry(Double.parseDouble(String.valueOf(scanner.nextDouble())));
    }
    public void output(){
        System.out.println("Ten:     "+ this.getName()+ "\n" + "Tuoi: "+ this.getAge()+"\n"+"Lop:      "+this.get_class()+ "  Toan "+this.getMath()+" Ly  "+this.getPhysics()+" Hoa  "+this.getChemistry());
    }

}
