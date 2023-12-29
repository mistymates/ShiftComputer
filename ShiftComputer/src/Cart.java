import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Part> parts;

    public Cart() {
        this.parts = new ArrayList<>();
    }

    public void addPart(Part part) {
        parts.add(part);
    }

    public Part[] getParts() {
        return parts.toArray(new Part[0]);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;

        for (Part part : parts) {
            totalPrice += part.getPrice();
        }

        return totalPrice;
    }

    public void clearCart() {
        parts.clear();
    }
}
