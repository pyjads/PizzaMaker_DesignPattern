package pattern.factory.factory_abstract;

import java.lang.reflect.InvocationTargetException;

public interface AbstractFactory< T > {

    public abstract T create (String object) throws IllegalAccessException, InvocationTargetException, InstantiationException;

}
