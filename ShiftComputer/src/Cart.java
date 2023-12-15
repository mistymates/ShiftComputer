public class Cart {
    private Part[] parts;
    private int size; 

    public Cart() {
        this.parts = new Part[10];
        this.size = 0;
    }

    public void addPart(Part part) {
        if (size < parts.length) {
            parts[size++] = part;
            System.out.println(part.getName() + " has been added to the cart.");
        } else {
            System.out.println("Cart is full. Cannot add more parts.");
        }
    }

    public void removePart(Part part) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (parts[i] == part) {
                shiftArrayToLeft(i);
                size--;
                found = true;
                System.out.println(part.getName() + " has been removed from the cart.");
                break;
            }
        }

        if (!found) {
            System.out.println(part.getName() + " not found in the cart.");
        }
    }

    private void shiftArrayToLeft(int index) {
        for (int i = index; i < size - 1; i++) {
            parts[i] = parts[i + 1];
        }
        parts[size - 1] = null; 
    }
}
