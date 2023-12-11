public class Store{
    private Part[] parts;

    public Store() {
        this.parts = new Part[10];
    }

    public Part[] getParts() {
        return this.parts;
    }
}