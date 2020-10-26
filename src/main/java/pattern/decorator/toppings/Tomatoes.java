package pattern.decorator.toppings;

import constant.Constants;
import pattern.decorator.bean.base.Pizza;
import pattern.visitor.costcalculator.CostVisitor;

public class Tomatoes extends Toppings {

    public Tomatoes (Pizza toppings) {
        super ( toppings );
    }

    @Override
    public double accept (CostVisitor visitor) {
        return toppings.accept ( visitor ) + visitor.calculateCost ( this );
    }

    @Override
    public String display (int selector) {
        return toppings.display ( selector ) + Constants.TOMATOES_DISPLAY;
    }
}
