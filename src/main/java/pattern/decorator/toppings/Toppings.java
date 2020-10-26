package pattern.decorator.toppings;

import pattern.decorator.bean.base.Pizza;

public abstract class Toppings implements Pizza {

    protected Pizza toppings;

    public Toppings (Pizza toppings) {
        this.toppings=toppings;
    }


}
