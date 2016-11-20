/**
 * VisitorTest
 * 
 * This class references both:
 *  - Visitor interface (from TaxVisitor class)
 *  - Visitable interface (from Necessity, Liquor and Tabacco classes)
 *
 * When you execute main() it will print values before tax and after applying
 * the new tax logic from TaxVisitor class.
 */
public class VisitorTest {

  public static void main(String[] args) {
    TaxVisitor currentTaxLogic = new TaxVisitor();

    Necessity milk = new Necessity(3.47);
    Liquor vodka = new Liquor(11.99);
    Tabacco cigars = new Tabacco(19.99);

    milk.accept(currentTaxLogic);
    vodka.accept(currentTaxLogic);
    cigars.accept(currentTaxLogic);
  }
}