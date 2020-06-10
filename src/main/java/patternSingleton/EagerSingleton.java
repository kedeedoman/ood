package patternSingleton;

/*
* As you might have guessed, this class initializes
* the instance in an eager way, i.e. it does not wait for other class to ask for it.
* As soon as the class loader loads the class,
* the static variables are initialized
*
* EagerSingleton is always thread safe.
*
* */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() { }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
