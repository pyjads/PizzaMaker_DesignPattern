package pattern.decorator.bean.special.menu.pizza;

import constant.Constants;
import pattern.decorator.bean.base.PlainPizza;
import pattern.decorator.toppings.CheeseBurst;
import pattern.decorator.toppings.Tomatoes;
import pattern.visitor.costcalculator.CostVisitor;

public class FarmHouse extends SpecialMenu {


    public FarmHouse ( ) {
        pizza=new CheeseBurst ( new Tomatoes ( new PlainPizza ( ) ) );
    }

    @Override
    public String display (int selector) {
        return Constants.FARMHOUSE_DISPLAY + pizza.display ( 3 );
    }

    @Override
    public double accept (CostVisitor vistior) {
        return pizza.accept ( vistior );
    }
}
