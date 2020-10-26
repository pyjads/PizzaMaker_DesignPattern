package pattern.facade.subsystem;


import pattern.factory.factories.PizzaFactory;
import pattern.factory.factories.VisitorFactory;
import pattern.factory.factory_abstract.AbstractFactory;
import pattern.visitor.costcalculator.CostVisitor;

import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;
import java.util.Date;

public class VisitorSelector {

    CostVisitor visitor;
    AbstractFactory<CostVisitor> factory=new VisitorFactory ( );

    public CostVisitor selectVisitor ( ) throws IllegalAccessException, InstantiationException, InvocationTargetException {

        Date date=new Date ( );

        Calendar calendar=Calendar.getInstance ( );
        calendar.setTime ( date );

        if ((calendar.get ( Calendar.DAY_OF_WEEK ) == Calendar.SATURDAY)
                || (calendar.get ( Calendar.DAY_OF_WEEK ) == Calendar.SUNDAY)) {

            visitor=factory.create ( "Holiday" );
        } else {
            visitor=factory.create ( "Regular" );

        }

        return visitor;
    }
}
