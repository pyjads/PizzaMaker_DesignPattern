package constant;

public class Constants {
    private Constants(){

    }
    // Base Price
    public static final double PLAIN_PIZZA=2.25;
    public static final double TOMATOES=0.35;
    public static final double CHEESE=0.25;
    public static final double CHEESE_BURST=0.40;
    public static final double OLIVES=0.15;

    // Price on WeekEnds wrt Base Price
    public static final double PLAIN_PIZZA_DISCOUNT=0.75;
    public static final double OLIVES_DISCOUNT=0.75;
    public static final double TOMATOES_DISCOUNT=0.75;
    public static final double CHEESE_DISCOUNT=0.90;
    public static final double CHEESE_BURST_DISCOUNT=0.85;

    // Display
    public static final String BILL_DISPLAY="Your Bill: %.2f $";
    public static final String PLAIN_PIZZA_DISPLAY="Enjoy your Pizza with ";
    public static final String TOMATOES_DISPLAY="Tomatoes, ";
    public static final String OLIVES_DISPLAY="Olives, ";
    public static final String CHEESE_DISPLAY="Cheese, ";
    public static final String BURST_DISPLAY=" Cheese BURST, ";
    public static final String EXTRA_DISPLAY="EXTRA ";
    public static final String FARMHOUSE_DISPLAY="Enjoy your FarmHouse Pizza with ingredients ";
    public static final String PEPPYOLIVES_DISPLAY="Enjoy your Peppy Olives Pizza with ingredients ";
    public static final String WELCOME_MESSAGE="Welcome to Pizza House";
}
