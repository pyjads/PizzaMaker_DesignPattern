package pattern.facade.controller;

import constant.Constants;
import pattern.decorator.bean.base.Pizza;
import pattern.decorator.bean.base.PlainPizza;
import pattern.facade.subsystem.PizzaSelector;
import pattern.facade.subsystem.VisitorSelector;
import pattern.facade.subsystem.Welcome;
import pattern.visitor.costcalculator.CostVisitor;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Controller {

    private Welcome welcome=new Welcome ( );
    private PizzaSelector selector=new PizzaSelector ( );
    private VisitorSelector visitorSelector=new VisitorSelector ( );

    private CostVisitor cost;

    public void main ( ) throws IOException, IllegalAccessException, InvocationTargetException, InstantiationException {
        welcome.display ( );

        cost=visitorSelector.selectVisitor ( );

        pizzaMenu ( );


    }

    public void pizzaMenu ( ) throws IOException, IllegalAccessException, InstantiationException, InvocationTargetException {

        Pizza pizza=selector.execute ( );

        if (!(pizza instanceof PlainPizza)) {
            System.out.println ( pizza.display ( 2 ) );
        } else {
            System.out.println ( pizza.display ( 0 ) );
        }

        System.out.format ( Constants.BILL_DISPLAY , pizza.accept ( cost ) );
    }
}
