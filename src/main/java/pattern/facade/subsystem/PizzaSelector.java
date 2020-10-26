package pattern.facade.subsystem;

import pattern.decorator.bean.base.Pizza;
import pattern.decorator.bean.base.PlainPizza;
import pattern.factory.factories.PizzaFactory;
import pattern.factory.factory_abstract.AbstractFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;

public class PizzaSelector {

    private BufferedReader reader=new BufferedReader ( new InputStreamReader ( System.in ) );
    private int option;
    private Pizza specialPizza;
    boolean status=false;

    private AbstractFactory < Pizza > factory=new PizzaFactory ( );


    public Pizza execute ( ) throws IOException, IllegalAccessException, InvocationTargetException, InstantiationException {
        status=false;
        while (true) {
            System.out.println ( "Please select the menu\n1. Special Menu\n2. Customize" );
            option=Integer.parseInt ( reader.readLine ( ) );

            if (option == 1) {
                specialMenu ( );
            } else if (option == 2) {
                customize ( );
            } else {
                System.out.println ( "Please select again" );
            }
            if(specialPizza != null){
                break;
            }
        }

        return specialPizza;
    }

    private void customize ( ) throws IOException, IllegalAccessException, InstantiationException, InvocationTargetException {
        status=false;
        specialPizza=new PlainPizza ( );
        while (true) {
            System.out.println ( "Select Your Single Topping\n1. No Topping\n2.Cheese\n3.Tomatoes\n4.Olives\n5.Cheese Burst\n6. Go Back" );
            option=Integer.parseInt ( reader.readLine ( ) );
            switch (option) {
                case 1:
                    break;
                case 2:
                    specialPizza=factory.create ( "Cheese" );
                    break;
                case 3:
                    specialPizza=factory.create ( "Tomatoes" );
                    break;
                case 4:
                    specialPizza=factory.create ( "Olives" );
                    break;
                case 5:
                    specialPizza=factory.create ( "CheeseBurst" );
                    break;
                case 6:
                    specialPizza=null;
                    status=true;
                    break;
                default:
                    break;

            }
            if (specialPizza != null) {
                break;
            }
            if (status) {
                break;
            }
        }

        if (status) {
            execute ( );
        }

    }

    private void specialMenu ( ) throws IOException, IllegalAccessException, InstantiationException, InvocationTargetException {
        status=false;
        while (true) {
            System.out.println ( ("1.FarmHouse\n2.Peppy Olives\n3.Go Back") );
            option=Integer.parseInt ( reader.readLine ( ) );
            if (option == 1) {
                specialPizza=factory.create ( "FarmHouse" );
                break;
            } else if (option == 2) {
                specialPizza=factory.create ( "PeppyOlives" );
                break;
            } else if (option == 3) {
                status=true;
                break;
            } else {
                System.out.println ( "Please select again" );
            }

        }

        if (status) {
            execute ( );
        }
    }

}
