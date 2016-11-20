/**
 * Necessity
 *
 * Invocation of constructor will set value to "price".
 * The accept(...) method will apply taxes based on implementation from Visitor interface.
 */
public class Necessity implements Visitable {

    private double price;
    
    public Necessity (double item) {
        price = item;
    }

    public double getPrice() {
        return price;
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}