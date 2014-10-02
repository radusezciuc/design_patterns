package ro.teamnet.radus.patterns.creational.singleton;

//Atunci cand clasa principala este incarcata, clasa SingletonHelper nu va fi incarcata in memorie
//SingletonHelper va fi incarcata si instanta INSTANCE va fi create doar cand cineva va apela metoda getInstance()
//Una din cele mai bune solutii; este thread safe.
public class BillPughSingleton {

    private BillPughSingleton(){}

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
