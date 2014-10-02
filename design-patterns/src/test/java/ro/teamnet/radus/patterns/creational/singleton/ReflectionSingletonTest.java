package ro.teamnet.radus.patterns.creational.singleton;


import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Constructor;

//Test ce arata ca patternul Singleton poate fi distrus prin Reflection
//Singurul tip de Singleton care nu poate fi distrus este EnumSingleton
public class ReflectionSingletonTest {

    EagerSingleton instanceOne;
    EagerSingleton instanceTwo;

    @Before
    public void setUp() throws Exception {
        instanceOne = EagerSingleton.getInstance();
        instanceTwo = null;
    }

    @Test
    public void destroySingletonPattern() throws Exception {
        try {
            Constructor[] constructors = EagerSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                instanceTwo = (EagerSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
