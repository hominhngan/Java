import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main (String args[]) {

        ArrayList<ID> lst_id = new ArrayList<>();
        lst_id.add(new ID("1"));
        lst_id.add(new ID("2"));
        lst_id.add(new ID("3"));

        ArrayList<Brand> lst_brand = new ArrayList<>();
        lst_brand.add(new Brand("ASUS"));
        lst_brand.add(new Brand("MSI"));
        lst_brand.add(new Brand("Intel"));

        ArrayList<CPU> lst_cpu = new ArrayList<>();
        lst_cpu.add(new CPU(lst_id.get(0), "Intel Core i9 10900k", lst_brand.get(0), 300000f));
        lst_cpu.add(new CPU(lst_id.get(1), "AMD Ryzen 9 5900X", lst_brand.get(1), 3000000f));
        lst_cpu.add(new CPU(lst_id.get(2), "AMD Ryzen 5 5600X", lst_brand.get(2), 3000000f));

        ArrayList<Mainboard> lst_mainboard = new ArrayList<>();
        lst_mainboard.add(new Mainboard(lst_id.get(0), "XT123", lst_brand.get(0), 300000f));
        lst_mainboard.add(new Mainboard(lst_id.get(1), "D1103", lst_brand.get(1), 3000000f));
        lst_mainboard.add(new Mainboard(lst_id.get(2), "CAD110", lst_brand.get(2), 3000000f));

        ArrayList<RAM> lst_ram = new ArrayList<>();
        lst_ram.add(new RAM(lst_id.get(0), "Intel Core i9 10900k", lst_brand.get(0), 300000f));
        lst_ram.add(new RAM(lst_id.get(1), "AMD Ryzen 9 5900X", lst_brand.get(1), 3000000f));
        lst_ram.add(new RAM(lst_id.get(2), "AMD Ryzen 5 5600X", lst_brand.get(2), 3000000f));

        ArrayList<Computer> lst_pc = new ArrayList<>();
        lst_pc.add(new Computer(lst_cpu.get(0), lst_mainboard.get(0), lst_ram.get(0), 5));
        lst_pc.add(new Computer(lst_cpu.get(1), lst_mainboard.get(1), lst_ram.get(1), 8));
        lst_pc.add(new Computer(lst_cpu.get(2), lst_mainboard.get(2), lst_ram.get(2), 10));

        lst_pc.forEach(computer -> {
            System.out.printf("%s %s %s %d %f\n", computer.getCpu().getName(), computer.getRam().getName(),
                    computer.getMainboard().getName(), computer.getSl(), computer.getPrice());
        });
    }
}