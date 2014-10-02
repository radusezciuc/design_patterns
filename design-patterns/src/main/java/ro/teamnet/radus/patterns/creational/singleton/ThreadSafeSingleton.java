package ro.teamnet.radus.patterns.creational.singleton;

//Metoda synchronized e destul de costisitoare din punctul de vedere al performantei
//Double checked locking singleton e mai bun din punctul asta de vedere
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton INSTANCE;

    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ThreadSafeSingleton();
        }
        return INSTANCE;
    }
}
