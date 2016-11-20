/**
 * Visitor
 *
 * Defines what kind of objects our implementation can handle.
 * Note: Usually here should be used Generics, instead of concrete names!
 */
public interface Visitor {

    public double visit (Liquor liquorItem);
    public double visit (Tabacco tabaccoItem);
    public double visit (Necessity necessityItem);

}