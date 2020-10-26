package pattern.factory.factories;

import pattern.decorator.bean.base.Pizza;
import pattern.decorator.bean.base.PlainPizza;
import pattern.decorator.bean.special.menu.pizza.FarmHouse;
import pattern.decorator.bean.special.menu.pizza.PeppyOlives;
import pattern.decorator.bean.special.menu.pizza.SpecialMenu;
import pattern.decorator.toppings.Cheese;
import pattern.decorator.toppings.CheeseBurst;
import pattern.decorator.toppings.Olives;
import pattern.decorator.toppings.Tomatoes;
import pattern.factory.factory_abstract.AbstractFactory;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class PizzaFactory implements AbstractFactory < Pizza > {

    private static Map < String, Class < ? extends Pizza > > hashMap=new HashMap <> ( );

    static {
        hashMap.put ( "FarmHouse" , FarmHouse.class );
        hashMap.put ( "PeppyOlives" , PeppyOlives.class );

        hashMap.put ( "Cheese" , Cheese.class );
        hashMap.put ( "CheeseBurst" , CheeseBurst.class );
        hashMap.put ( "Tomatoes" , Tomatoes.class );
        hashMap.put ( "Olives" , Olives.class );
    }

    @Override
    public Pizza create (String object) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        // NullPointer Exception should also be caught if required
        Class < ? extends Pizza > pizza=hashMap.get ( object );

        if (SpecialMenu.class.isAssignableFrom ( pizza )) {
            return (Pizza) pizza.getDeclaredConstructors ( )[0].newInstance ( );
        } else {
            return (Pizza) pizza.getDeclaredConstructors ( )[0].newInstance ( new PlainPizza ( ) );
        }
    }

}

