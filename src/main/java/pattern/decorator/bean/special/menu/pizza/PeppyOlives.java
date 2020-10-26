package pattern.decorator.bean.special.menu.pizza;

import constant.Constants;
import pattern.decorator.bean.base.PlainPizza;
import pattern.decorator.toppings.Cheese;
import pattern.decorator.toppings.Olives;
import pattern.visitor.costcalculator.CostVisitor;

public class PeppyOlives extends SpecialMenu {

    public PeppyOlives ( ) {

        pizza=new Cheese ( new Olives ( new PlainPizza ( ) ) );
    }

    @Override
    public String display (int selector) {
        return Constants.PEPPYOLIVES_DISPLAY + pizza.display ( 3 );
    }

    @Override
    public double accept (CostVisitor visitor) {
        return pizza.accept ( visitor );
    }
}
