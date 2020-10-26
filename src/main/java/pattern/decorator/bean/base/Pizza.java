package pattern.decorator.bean.base;

import pattern.visitor.costcalculator.Visitable;

public interface Pizza extends Visitable {

    String display (int selector);

}
