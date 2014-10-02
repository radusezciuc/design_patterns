package ro.teamnet.radus.patterns.creational.prototype;

public class Show implements PrototypeCapable{

    private String name = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Show clone() {
        try {
            System.out.println("Cloning Show object...");
            return (Show) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Obiectul Show nu a putut fi creat");
        }
    }

    @Override
    public String toString() {
        return "Show";
    }
}
