package ClassType.Basic;

class Singleton {
    private static Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {}

    // Public method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton Instance");
    }
}

final class ImmutableClass {
    private final String name;
    private final int age;

    // Constructor to initialize fields
    public ImmutableClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters to access fields
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class WrapperClassDemo {
    public static void main(String[] args) {
        // Primitive to Wrapper
        int primitive = 10;
        Integer wrapper = Integer.valueOf(primitive);
        System.out.println("Wrapper: " + wrapper);

        // Wrapper to Primitive
        int unwrapped = wrapper.intValue();
        System.out.println("Unwrapped: " + unwrapped);

        // Autoboxing and Unboxing
        Integer autoBoxed = primitive; // Autoboxing
        int autoUnboxed = autoBoxed;  // Unboxing
        System.out.println("Autoboxed: " + autoBoxed + ", AutoUnboxed: " + autoUnboxed);
    }
}

public class main {
    public static void main(String[] args) {
        // Singleton Pattern
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        // Immutable Class
        ImmutableClass immutable = new ImmutableClass("John", 30);
        System.out.println("Immutable Name: " + immutable.getName());
        System.out.println("Immutable Age: " + immutable.getAge());

        // Wrapper Class Demo
        WrapperClassDemo.main(args);
    }
}
