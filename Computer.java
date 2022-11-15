import java.util.Scanner;

public class Computer {

    Scanner scanner = new Scanner(System.in);

    private CPU cpu;
    private Mainboard mainboard;
    private RAM ram;
    private ID id;
    private Brand brand;
    private String name;
    private float price;
    private int sl;

    public Computer(CPU cpu, Mainboard mainboard, RAM ram, int sl) {
        this.cpu = cpu;
        this.mainboard = mainboard;
        this.ram = ram;
        this.price = cpu.getPrice() + ram.getPrice() + mainboard.getPrice();
        this.sl = sl;
    }
    public ID getId() {
        return id;
    }
    public void setId(ID id) {
        this.id = id;
    }
    public Brand getBrand() {
        return brand;
    }
    public void setBrand(Brand brand) {
        this.brand = brand;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public CPU getCpu() {
        return cpu;
    }
    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
    public Mainboard getMainboard() {
        return mainboard;
    }
    public void setMainboard(Mainboard mainboard) {
        this.mainboard = mainboard;
    }
    public RAM getRam() {
        return ram;
    }
    public void setRam(RAM ram) {
        this.ram = ram;
    }
    public int getSl() {
        return sl;
    }
}
