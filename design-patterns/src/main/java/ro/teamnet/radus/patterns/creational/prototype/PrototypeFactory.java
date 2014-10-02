package ro.teamnet.radus.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {

    public static Map<String, PrototypeCapable> prototypes = new HashMap<String, PrototypeCapable>();

    static {
        prototypes.put(ModelType.MOVIE.getValue(), new Movie());
        prototypes.put(ModelType.ALBUM.getValue(), new Album());
        prototypes.put(ModelType.SHOW.getValue(), new Show());
    }

    public static PrototypeCapable getInstance(ModelType modelType) {
        try {
            return prototypes.get(modelType.getValue()).clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
