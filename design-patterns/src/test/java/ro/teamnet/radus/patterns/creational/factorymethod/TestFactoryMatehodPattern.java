package ro.teamnet.radus.patterns.creational.factorymethod;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestFactoryMatehodPattern {

    List<Document> documentList;

    @Before
    public void setUp() throws Exception {
        documentList = new ArrayList<Document>();
        documentList.add(new Resume());
        documentList.add(new Report());
    }

    @Test
    public void testFactoryMethod() throws Exception {
        for(Document document : documentList) {

        }
    }
}
