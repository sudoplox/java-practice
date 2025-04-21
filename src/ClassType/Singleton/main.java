package ClassType.Singleton;

public class main {
    public static void main(String[] args) {
        // Eager Singleton
        EagerSingleton eagerInstance = EagerSingleton.getInstance();
        System.out.println("Eager Singleton Instance: " + eagerInstance);

        // Lazy Singleton
        LazySingleton lazyInstance = LazySingleton.getInstance();
        System.out.println("Lazy Singleton Instance: " + lazyInstance);

        // Synchronized Singleton
        SynchronizedSingleton synchronizedInstance = SynchronizedSingleton.getInstance();
        System.out.println("Synchronized Singleton Instance: " + synchronizedInstance);

        // Double-Check Lock Singleton
        DoubleCheckLockSingleton doubleCheckInstance = DoubleCheckLockSingleton.getInstance();
        System.out.println("Double-Check Lock Singleton Instance: " + doubleCheckInstance);

        // Bill Pugh Singleton
        BillPughSingleton billPughInstance = BillPughSingleton.getInstance();
        System.out.println("Bill Pugh Singleton Instance: " + billPughInstance);

        // Enum Singleton
        EnumSingleton enumInstance = EnumSingleton.INSTANCE;
        enumInstance.showMessage();
    }
}