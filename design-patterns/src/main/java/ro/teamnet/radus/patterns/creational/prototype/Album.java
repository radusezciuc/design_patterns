package ro.teamnet.radus.patterns.creational.prototype;


public class Album implements PrototypeCapable{

    private String name = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Album clone() {
        try {
            System.out.println("Cloning Album object...");
            return (Album) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Obiectul Album nu a putut fi creat");
        }
    }

    @Override
    public String toString() {
        return "Album";
    }
}
