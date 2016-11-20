import java.text.DecimalFormat;

/**
 * TaxVisitor business logic for handling all operations
 * Note: This can handle all overriden methods!
 */
public class TaxVisitor implements Visitor {
    DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public TaxVisitor() {}

    @Override
    public double visit (Liquor liquorItem) {
        System.out.println("Liquor item (Pre-tax): " + liquorItem.getPrice());
        System.out.println("Liquor item (Sold on): " + decimalFormat.format((liquorItem.getPrice() * .18) + liquorItem.getPrice()) + "\n");
        return Double.parseDouble(decimalFormat.format((liquorItem.getPrice() * .18) + liquorItem.getPrice()));
    }

    @Override
    public double visit (Tabacco tabaccoItem) {
        System.out.println("Tabacco item (Pre-tax): " + tabaccoItem.getPrice());
        System.out.println("Tabacco item (Sold on): " + decimalFormat.format((tabaccoItem.getPrice() * .18) + tabaccoItem.getPrice()) + "\n");
        return Double.parseDouble(decimalFormat.format((tabaccoItem.getPrice() * .32) + tabaccoItem.getPrice()));
    }

    @Override
    public double visit (Necessity necessityItem) {
        System.out.println("Necessity item (Pre-tax): " + necessityItem.getPrice());
        System.out.println("Necessity item (Sold on): " + decimalFormat.format((necessityItem.getPrice() * .18) + necessityItem.getPrice()) + "\n");
        return Double.parseDouble(decimalFormat.format((necessityItem.getPrice() * .0) + necessityItem.getPrice()));
    }
}