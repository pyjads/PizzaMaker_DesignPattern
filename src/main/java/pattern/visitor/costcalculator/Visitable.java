package pattern.visitor.costcalculator;

public interface Visitable {

    double accept (CostVisitor visitor);
}
