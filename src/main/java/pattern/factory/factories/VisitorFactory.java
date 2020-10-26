package pattern.factory.factories;

import pattern.factory.factory_abstract.AbstractFactory;
import pattern.visitor.costcalculator.CostVisitor;
import pattern.visitor.costcalculator.HolidayVisitor;
import pattern.visitor.costcalculator.RegularVisitor;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class VisitorFactory implements AbstractFactory < CostVisitor > {
    static Map < String, Class < ? extends CostVisitor > > hashMap=new HashMap <> ( );

    static {
        hashMap.put ( "Holiday" , HolidayVisitor.class );
        hashMap.put ( "Regular" , RegularVisitor.class );
    }

    @Override
    public CostVisitor create (String object) throws IllegalAccessException, InvocationTargetException, InstantiationException {

        // NullPointer Exception should also be caught if required
        Class < ? extends CostVisitor > visitor=hashMap.get ( object );

        return (CostVisitor) visitor.getDeclaredConstructors ( )[0].newInstance ( );
    }
}
