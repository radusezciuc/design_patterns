package ro.teamnet.radus.patterns.creational.singleton;

//Nu e recomandat
//Nu e thread safe
public class LazyInitializationSingleton {

    private static LazyInitializationSingleton INSTANCE;

    private LazyInitializationSingleton(){}

    public static LazyInitializationSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazyInitializationSingleton();
        }
        return INSTANCE;
    }
}
