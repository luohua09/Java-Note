package design_pattern.singleton.create;

/**
 * Created by qindongliang on 2018/7/5.
 */
public class SimpleSingleton {

    private final static  SimpleSingleton ourInstance = new SimpleSingleton();

    private SimpleSingleton() {
    }

    public static SimpleSingleton getInstance() {
        return ourInstance;
    }
}
