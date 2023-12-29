import java.util.Scanner;
import java.util.List;

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
        while (true) {
            System.out.println("\n=====Daftar Part=====");
            System.out.println("    1. GPU");
            System.out.println("    2. CPU");
            System.out.println("    3. POWER SUPPLY");
            System.out.println("    4. MOTHERBOARD");
            System.out.println("    5. RAM");
            System.out.println("    6. STORAGE");
            System.out.println("    7. CASE");
            System.out.println("    8. EXIT");
            System.out.print("Pilih part yang ingin dibeli (1-8): ");
    
            Part selectedPart = null;
            List<? extends Part> partList = null;
    
            int menu = scanner.nextInt();
    
            switch (menu) {
                case 1:
                    partList = store.getGPUs();
                    break;
                case 2:
                    partList = store.getCPUs();
                    break;
                case 3:
                    partList = store.getPowerSupplies();
                    break;
                case 4:
                    partList = store.getMotherboards();
                    break;
                case 5:
                    partList = store.getRAMs();
                    break;
                case 6:
                    partList = store.getStorages();
                    break;
                case 7:
                    partList = store.getCases();
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi");
                    continue; 
            }
    
            System.out.println("===Daftar Part===");
            int index = 1;
            for (Part part : partList) {
                System.out.println(index + ". " + part.getClass().getSimpleName() + ": " + part.getName());
                index++;
            }
    
            System.out.print("Pilih part yang ingin dibeli (1-" + partList.size() + "): ");
            int partMenu = scanner.nextInt();
    
            if (partMenu >= 1 && partMenu <= partList.size()) {
                selectedPart = partList.get(partMenu - 1);
                cart.addPart(selectedPart);
                System.out.println(selectedPart.getClass().getSimpleName() + " " + selectedPart.getName() + " telah ditambahkan ke Cart.");
            } else {
                System.out.println("Pilihan part tidak valid.");
            }
    
            System.out.print("Apakah Anda ingin membeli part lainnya? (ya/tidak): ");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("ya")) {
                break; 
            }
        }
    }

    public void viewCart() {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("\nCart Menu: ");
            System.out.println("1.View Cart");
            System.out.println("2.Checkout");
            System.out.println("3.Clear Cart");
            System.out.println("4.Exit");
            System.out.println("Pilihlah Menu: ");
            int pilih = scanner.nextInt();

            switch (pilih) {
                case 1:
                displayCart();
                break;
                case 2:
                Checkout();
                break;
                case 3:
                clearCart();
                break;
                case 4:
                return;
            }
        }
    }

    public void displayCart(){
    System.out.println("=== Cart ===");
    Part[] cartItems = cart.getParts();

    if (cartItems.length == 0) {
        System.out.println("Cart is empty.");
    } else {
        for (Part part : cartItems) {
            if (part != null) {
                part.displayDetails();
            }
        }
    }
    }

    public void clearCart(){
    cart.clearCart();

}

public void Checkout() {
    System.out.println("=== Checkout ===");
    displayCart(); 
    double totalPrice = cart.calculateTotalPrice();
    System.out.println("Total Price: Rp" + totalPrice);
    System.out.println("Thank you for shopping!");
    clearCart(); 
}
    }