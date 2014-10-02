package ro.teamnet.radus.patterns.creational.factorymethod;


public class Report extends Document{

    public void createPages() {
        this.getPages().add(new IntroductionPage());
        this.getPages().add(new ResultsPage());
        this.getPages().add(new ConclusionPage());
    }
}
