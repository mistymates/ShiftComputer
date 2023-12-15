public class Store {
    private Part[] parts;

    public Store() {
        this.parts = new Part[10];
        initializeStore();
    }

    private void initializeStore() {
        parts[0] = new GPU("NVIDIA RTX 3080", 9000000, 10);
        parts[1] = new GPU("AMD Radeon RX 6800 XT", 1100000, 12);
        parts[2] = new GPU("NVIDIA RTX 3090", 12000000, 24);
        parts[3] = new CPU("Intel Core i9-10900K", 6000000, 10);
        parts[4] = new CPU("AMD Ryzen 9 5900X", 5500000, 12);
        parts[5] = new CPU("Intel Core i7-10700K", 6500000, 8);
    }

    public Part[] getParts() {
        return this.parts;
    }
}
