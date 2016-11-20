/**
 * Liquor
 *
 * Invocation of constructor will set value to "price".
 * The accept(...) method will apply taxes based on implementation from Visitor interface.
 */
public class Liquor implements Visitable {

    private double price;
    
    public Liquor (double item) {
        price = item;
    }

    public double getPrice() {
        return price;
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}