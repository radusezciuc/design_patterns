package ro.teamnet.radus.patterns.creational.factorymethod;

public class Resume extends Document {

    public void createPages() {
        this.getPages().add(new SkillsPage());
        this.getPages().add(new EducationPage());
        this.getPages().add(new ExperiencePage());
    }
}
