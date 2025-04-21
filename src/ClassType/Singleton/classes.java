package ClassType.Singleton;

// This is a Singleton pattern implementation in Java.
// The Singleton pattern ensures that a class has only one instance and provides a global point of access to it.
class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}

// This is a Lazy Singleton pattern implementation in Java.
// The Lazy Singleton pattern creates the instance only when it is needed.
class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}

// This is a Synchronized Singleton pattern implementation in Java.
// The Synchronized Singleton pattern uses synchronized methods to ensure that only one thread can access the method at a time.
class SynchronizedSingleton {
    private static SynchronizedSingleton instance;

    private SynchronizedSingleton() {}

    public static synchronized SynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }
}

// This is a Double-Check Lock Singleton pattern implementation in Java.
// The Double-Check Lock Singleton pattern reduces the overhead of acquiring a lock by first checking if the instance is null before synchronizing.
class DoubleCheckLockSingleton {
    private static volatile DoubleCheckLockSingleton instance;

    private DoubleCheckLockSingleton() {}

    public static DoubleCheckLockSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLockSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockSingleton();
                }
            }
        }
        return instance;
    }
}

// This is a Bill Pugh Singleton pattern implementation in Java.
// The Bill Pugh Singleton pattern uses a static inner helper class to hold the Singleton instance.
class BillPughSingleton {
    private BillPughSingleton() {}

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}

enum EnumSingleton {
    INSTANCE;

    public void showMessage() {
        System.out.println("Enum Singleton Instance");
    }
}
