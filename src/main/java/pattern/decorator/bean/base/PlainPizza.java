package pattern.decorator.bean.base;

import constant.Constants;
import pattern.visitor.costcalculator.CostVisitor;

public class PlainPizza implements Pizza {

    @Override
    public double accept (CostVisitor visitor) {
        return visitor.calculateCost ( this );
    }

    @Override
    public String display (int selector) {
        if (selector == 2) {
            return Constants.PLAIN_PIZZA_DISPLAY;
        } else if (selector == 0) {
            return Constants.PLAIN_PIZZA_DISPLAY.substring ( 0 , 16 );
        }
        return "";
    }
}
