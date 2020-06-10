package patternSingleton;

/*
* The easiest way to make the singleton class thread safe is to
* make the whole getInstance method synchronized.
*
* However, as getInstance() method might me called several times in the application,
* it can lead to some performance issue as synchronizing a method can
* decrease performance by a factor of 100.
*
* Hence, we synchronize the block of code,
* which initialises the instance for the first time.
*
* Here, "double check locking" is required as two thread might
* try to get the lock to execute the code inside synchronized block,
* one which is successful, will initialize the instance and release
* the lock once done. Then the second thread acquires the lock
* and try to execute the same code block, if the second null check is
* not there, we will end up with two instances of the singleton class.
*
* Also, we need to declare the "instance" of type volatile, as the
* two thread we discussed above, can be running on two different cores,
* once the first thread is done with initializing the instance, it might
* not have wrote it back to the memory(register -> cache -> memory)
* before the second thread reads it(memory -> cache -> resister).
* Making the variable volatile, ensure the write and read happens
* directly to and from the memory.
*
* */

public class ThreadSafeLazySingleton {

    private volatile static ThreadSafeLazySingleton instance = null;

    private ThreadSafeLazySingleton() {}

    public static ThreadSafeLazySingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeLazySingleton.class) {
                if(instance == null) instance = new ThreadSafeLazySingleton();
            }
        }
        return instance;
    }
}
