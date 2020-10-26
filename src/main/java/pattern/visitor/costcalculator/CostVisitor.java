package pattern.visitor.costcalculator;

import pattern.decorator.bean.base.PlainPizza;
import pattern.decorator.toppings.Cheese;
import pattern.decorator.toppings.CheeseBurst;
import pattern.decorator.toppings.Olives;
import pattern.decorator.toppings.Tomatoes;

public interface CostVisitor {

    double calculateCost (PlainPizza pizza);

    double calculateCost (Tomatoes tomatoes);

    double calculateCost (Cheese cheese);

    double calculateCost (Olives olives);

    double calculateCost (CheeseBurst cheeseBurst);
}
