/**
 * Visitable
 *
 * Required interface for all classes which have to be bounded to TaxVisitor's logic through Visitor interface.
 */
public interface Visitable {
    public double accept(Visitor visitor);
}