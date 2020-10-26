package pattern.visitor.costcalculator;

import constant.Constants;
import pattern.decorator.bean.base.PlainPizza;
import pattern.decorator.toppings.Cheese;
import pattern.decorator.toppings.CheeseBurst;
import pattern.decorator.toppings.Olives;
import pattern.decorator.toppings.Tomatoes;

public class HolidayVisitor implements CostVisitor {

    @Override
    public double calculateCost (PlainPizza pizza) {
        return Constants.PLAIN_PIZZA * Constants.PLAIN_PIZZA_DISCOUNT;
    }

    @Override
    public double calculateCost (Tomatoes tomatoes) {
        return Constants.TOMATOES * Constants.TOMATOES_DISCOUNT;
    }

    @Override
    public double calculateCost (Cheese cheese) {
        return Constants.CHEESE * Constants.CHEESE_DISCOUNT;
    }

    @Override
    public double calculateCost (Olives olives) {
        return Constants.OLIVES * Constants.OLIVES_DISCOUNT;
    }

    @Override
    public double calculateCost (CheeseBurst cheeseBurst) {
        return Constants.CHEESE_BURST * Constants.CHEESE_BURST_DISCOUNT;
    }
}
