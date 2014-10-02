package ro.teamnet.radus.patterns.creational.prototype;


public class Movie implements PrototypeCapable{
    private String name = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Movie clone() {
        try {
            System.out.println("Cloning Movie object...");
            return (Movie) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Obiectul Movie nu a putut fi creat");
        }
    }

    @Override
    public String toString() {
        return "Movie";
    }
}
