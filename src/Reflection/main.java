package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class SampleClass {
    private String privateField = "Private Field Value";

    public SampleClass() {}

    public SampleClass(String value) {
        this.privateField = value;
    }

    public void publicMethod() {
        System.out.println("Public Method Invoked");
    }

    private void privateMethod() {
        System.out.println("Private Method Invoked");
    }
}

public class main {
    public static void main(String[] args) {
        try {
            // 1. Getting Class Information
            Class<?> clazz = SampleClass.class;
            System.out.println("Class Name: " + clazz.getName());

            // 2. Accessing Constructors
            Constructor<?>[] constructors = clazz.getConstructors();
            System.out.println("Constructors:");
            for (Constructor<?> constructor : constructors) {
                System.out.println(" - " + constructor);
            }

            // 3. Accessing Fields
            Field[] fields = clazz.getDeclaredFields();
            System.out.println("Fields:");
            for (Field field : fields) {
                System.out.println(" - " + field.getName());
            }

            // 4. Accessing Methods
            Method[] methods = clazz.getDeclaredMethods();
            System.out.println("Methods:");
            for (Method method : methods) {
                System.out.println(" - " + method.getName());
            }

            // 5. Creating an Instance
            Constructor<?> constructor = clazz.getConstructor(String.class);
            Object instance = constructor.newInstance("Reflection Example");
            System.out.println("Instance Created: " + instance);

            // 6. Accessing and Modifying Private Fields
            Field privateField = clazz.getDeclaredField("privateField");
            privateField.setAccessible(true);
            privateField.set(instance, "Modified Private Field Value");
            System.out.println("Modified Field Value: " + privateField.get(instance));

            // 7. Invoking Methods
            Method publicMethod = clazz.getMethod("publicMethod");
            publicMethod.invoke(instance);

            Method privateMethod = clazz.getDeclaredMethod("privateMethod");
            privateMethod.setAccessible(true);
            privateMethod.invoke(instance);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}