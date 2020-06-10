package patternSingleton;

/*
* Instance of this class is initialized in a lazy manner,
* i.e. it initialises the instance only when some other class
* asks for it.
*
* Also, this particular implementation of Singleton is NOT thread safe.
* We will see ways to make our LazySingleton thread safe.
*
* */

public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (instance == null) instance = new LazySingleton();
        return instance;
    }
}
