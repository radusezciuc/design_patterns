package ro.teamnet.radus.patterns.creational.singleton;

//Nu e recomandat
//Se va crea de fiecare data o instanta a acestei clase, chiar daca utilizatorul nu are nevoie de ea
//Nu e thread safe
public class StaticBlockSingleton {

    private static StaticBlockSingleton INSTANCE;

    private StaticBlockSingleton(){}

    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }

}
