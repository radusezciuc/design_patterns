package ro.teamnet.radus.patterns.creational.prototype;

import org.junit.Test;

public class TestPrototypePattern {

    @Test
    public void testPrototypePattern() throws Exception {

        System.out.println(PrototypeFactory.getInstance(ModelType.MOVIE));
        System.out.println(PrototypeFactory.getInstance(ModelType.ALBUM));
        System.out.println(PrototypeFactory.getInstance(ModelType.SHOW));
    }
}
