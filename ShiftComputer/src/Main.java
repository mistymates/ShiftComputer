// File Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShiftKomputer shiftKomputer = new ShiftKomputer();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("===Selamat datang di ShiftComputer===");
            System.out.println("1. Beli Part");
            System.out.println("2. Bandingkan Part");
            System.out.println("3. Rakit Computer");
            System.out.println("4. Beli Computer");
            System.out.println("5. Cart");
            System.out.println("6. Exit");
            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    shiftKomputer.buyPart();
                    break;
                case 2:
                    shiftKomputer.comparePart();
                    break;
                case 3:
                    shiftKomputer.buildComputer();
                    break;
                case 4:
                    shiftKomputer.buyComputer();
                    break;
                case 5:
                    shiftKomputer.viewCart();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
    }
}
