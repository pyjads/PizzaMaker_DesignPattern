package main;


import pattern.facade.controller.Controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main (String[] args) {


        try {
            Controller controller=new Controller ( );
            controller.main ( );
        } catch (IOException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            System.out.println ( "Error with the system. Please try again" );
        }


    }
}
