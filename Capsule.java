public class Capsule extends Medicine {

    private int quantity;

    public Capsule() {

    }

    public Capsule(String name, String id, double price, int quantity) {
        super(name, id, price);
        this.quantity = quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}
