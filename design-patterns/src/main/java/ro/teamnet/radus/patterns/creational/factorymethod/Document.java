package ro.teamnet.radus.patterns.creational.factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Document {

    private List<Page> pages = new ArrayList<Page>();

    public Document() {
        this.createPages();
    }

    public abstract void createPages();

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }
}
