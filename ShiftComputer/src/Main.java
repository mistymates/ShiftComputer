import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShiftKomputer shiftKomputer = new ShiftKomputer();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("        \n===Selamat datang di ShiftComputer===");
            System.out.println("        1. Beli Part");
            System.out.println("        2. Cart");
            System.out.println("        3. Exit");
            System.out.print("      Pilih menu: ");

            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    shiftKomputer.buyPart();
                    break;
                case 2:
                    shiftKomputer.viewCart();
                    break;
                case 3:
                    System.out.print("""
                        Terimakasih telah menggunakan aplikasi ShiftComputer
                                    Sampai jumpa lagi!""");
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi");
            }
        }
        scanner.close();
    }
}