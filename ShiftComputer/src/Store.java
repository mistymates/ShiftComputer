public class Store{
    private Part[] parts;

    public Store() {
        this.parts = new Part[10];
        // Initialize parts
    }

    public Part[] getParts() {
        return this.parts;
    }
}