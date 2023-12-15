public class Store {
    private Part[] parts;

    public Store() {
        this.parts = new Part[10];
        initializeStore();
    }

    private void initializeStore() {
        // Create GPU objects and add them to the parts array
        parts[0] = new GPU("NVIDIA RTX 3080", 1200, 10);
        parts[1] = new GPU("AMD Radeon RX 6800 XT", 1100, 12);
        // Add more GPU objects as needed

        // Initialize other parts if necessary (CPU, POWER SUPPLY, etc.)
    }

    public Part[] getParts() {
        return this.parts;
    }
}
