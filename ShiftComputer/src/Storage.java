public class Storage extends Part {
    private int size;

    public Storage(String name, int price, int size) {
        super(name, price);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(size + "TB");
    }
}