import java.util.Scanner;

public class ShiftKomputer {
    private Store store;
    private Cart cart;
    private Scanner scanner;

    public ShiftKomputer() {
        this.store = new Store();
        this.cart = new Cart();
        this.scanner = new Scanner(System.in);
    }

    public void buyPart() {
        System.out.println("===Daftar Part===");
        System.out.println("1. GPU");
        System.out.println("2. CPU");
        System.out.println("3. POWER SUPPLY");
        System.out.println("4. MOTHERBOARD");
        System.out.println("5. RAM");
        System.out.println("6. STORAGE");
        System.out.println("7. CASE");
        System.out.println("8. EXIT");
        Part[] parts = this.store.getParts();
        System.out.print("Pilih part yang ingin dibeli:");
        System.out.println("");
        int menu = scanner.nextInt();

        switch (menu) {
            case 1:
                System.out.println("===Daftar GPU===");
                for (int i = 0; i < parts.length; i++) {
                    if (parts[i] instanceof GPU) {
                        System.out.println(i + ". " + parts[i].getName() + " - " + parts[i].getPrice());
                    }
                }
                System.out.print("Pilih GPU yang ingin dibeli: ");
                int gpu = scanner.nextInt();

                this.cart.addPart(parts[gpu]);
                break;
            }
        }

    public void comparePart() {
    }

    public void buildComputer() {
    }

    public void buyComputer() {
    }

    public void viewCart() {
    }
}