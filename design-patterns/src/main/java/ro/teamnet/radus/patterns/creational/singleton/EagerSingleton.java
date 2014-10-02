package ro.teamnet.radus.patterns.creational.singleton;

//Nu e recomandat
//Se va crea de fiecare data o instanta a acestei clase, chiar daca utilizatorul nu are nevoie de ea
//Nu e thread safe
public class EagerSingleton {

    private static final EagerSingleton INSTANCE = new EagerSingleton();

    //constructorul privat nu permite o noua instantiere facuta din exterior
    private EagerSingleton(){}

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
