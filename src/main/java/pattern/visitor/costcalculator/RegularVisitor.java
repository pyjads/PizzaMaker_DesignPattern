package pattern.visitor.costcalculator;

import constant.Constants;
import pattern.decorator.bean.base.PlainPizza;
import pattern.decorator.toppings.Cheese;
import pattern.decorator.toppings.CheeseBurst;
import pattern.decorator.toppings.Olives;
import pattern.decorator.toppings.Tomatoes;

public class RegularVisitor implements CostVisitor {


    @Override
    public double calculateCost (PlainPizza pizza) {
        return Constants.PLAIN_PIZZA;
    }


    @Override
    public double calculateCost (Tomatoes tomatoes) {
        return Constants.TOMATOES;
    }

    @Override
    public double calculateCost (Cheese cheese) {
        return Constants.CHEESE;
    }

    @Override
    public double calculateCost (Olives olives) {
        return Constants.OLIVES;
    }

    @Override
    public double calculateCost (CheeseBurst cheeseBurst) {
        return Constants.CHEESE_BURST;
    }
}
