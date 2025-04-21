package ClassType.FunctionalInterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// Custom functional interface
// A functional interface is an interface that contains exactly one abstract method.
@FunctionalInterface
interface CustomFunctionalInterface {
    void execute(String message);

    // Default method in a functional interface
    default void defaultMethod() {
        System.out.println("This is a default method in a functional interface.");
    }
    // Static method in a functional interface
    static void staticMethod() {
        System.out.println("This is a static method in a functional interface.");
    }
    // Object class method in a functional interface
    String toString();
}

public class main {
    public static void main(String[] args) {
        // Custom Functional Interface
        CustomFunctionalInterface customInterface = (message) -> {
            System.out.println("Custom Functional Interface: " + message);
        };
        customInterface.execute("Hello, World!");

        // Predicate Functional Interface
        // Predicate is a functional interface that takes one argument and returns a boolean value.
        Predicate<Integer> isEven = (number) -> number % 2 == 0;
        System.out.println("Predicate: Is 4 even? " + isEven.test(4));

        // Consumer Functional Interface
        // Consumer is a functional interface that takes one argument and returns no result.
        Consumer<String> printMessage = (message) -> System.out.println("Consumer: " + message);
        printMessage.accept("This is a Consumer example.");

        // Function Functional Interface
        // Function is a functional interface that takes one argument and returns a result.
        Function<Integer, String> numberToString = number -> "Number: " + number;
        System.out.println("Function: " + numberToString.apply(10));

        // Supplier Functional Interface
        // Supplier is a functional interface that does not take any arguments and returns a result.
        Supplier<String> supplyMessage = () -> "This is a Supplier example.";
        System.out.println("Supplier: " + supplyMessage.get());
    }
}