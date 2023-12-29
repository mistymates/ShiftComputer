public class PowerSupply extends Part {
    private int watt;

    public PowerSupply(String name, int price, int watt) {
        super(name, price);
        this.watt = watt;
    }

    public int getWATT() {
        return watt;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(watt + "WATT");
    }
}