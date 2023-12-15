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
        System.out.print("Pilih part yang ingin dibeli: ");
        int menu = scanner.nextInt();
    
        switch (menu) {
            case 1:
                System.out.println("===Daftar GPU===");
                for (Part part : parts) {
                    if (part instanceof GPU) {
                        part.displayDetails();
                    }
                }
                
                System.out.print("Pilih GPU yang ingin dibeli (1-" + parts.length + "): ");
                int gpuMenu = scanner.nextInt();
                
                if (gpuMenu >= 1 && gpuMenu <= parts.length) {
                    // Assuming GPU index is gpuMenu - 1
                    Part selectedGPU = parts[gpuMenu - 1];
                    cart.addPart(selectedGPU);
                    System.out.println("GPU " + selectedGPU.getName() + " telah ditambahkan ke Cart.");
                } else {
                    System.out.println("Pilihan GPU tidak valid.");
                }
                break;
            case 2:
                // Add code for other parts (CPU, POWER SUPPLY, etc.) as needed
                break;
            // ... Add cases for other parts
            case 8:
                // EXIT
                break;
            default:
                System.out.println("Pilihan tidak valid. Silahkan coba lagi");
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