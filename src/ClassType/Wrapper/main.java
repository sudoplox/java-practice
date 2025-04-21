package ClassType.Wrapper;

public class main {
    public static void main(String[] args) {
        // Integer Wrapper Class
        int primitiveInt = 10;
        Integer wrapperInt = Integer.valueOf(primitiveInt); // Autoboxing
        System.out.println("Integer Wrapper: " + wrapperInt);
        int unboxedInt = wrapperInt.intValue(); // Unboxing
        System.out.println("Unboxed Integer: " + unboxedInt);

        // Double Wrapper Class
        double primitiveDouble = 20.5;
        Double wrapperDouble = Double.valueOf(primitiveDouble); // Autoboxing
        System.out.println("Double Wrapper: " + wrapperDouble);
        double unboxedDouble = wrapperDouble.doubleValue(); // Unboxing
        System.out.println("Unboxed Double: " + unboxedDouble);

        // Character Wrapper Class
        char primitiveChar = 'A';
        Character wrapperChar = Character.valueOf(primitiveChar); // Autoboxing
        System.out.println("Character Wrapper: " + wrapperChar);
        char unboxedChar = wrapperChar.charValue(); // Unboxing
        System.out.println("Unboxed Character: " + unboxedChar);

        // Boolean Wrapper Class
        boolean primitiveBoolean = true;
        Boolean wrapperBoolean = Boolean.valueOf(primitiveBoolean); // Autoboxing
        System.out.println("Boolean Wrapper: " + wrapperBoolean);
        boolean unboxedBoolean = wrapperBoolean.booleanValue(); // Unboxing
        System.out.println("Unboxed Boolean: " + unboxedBoolean);

        // Float Wrapper Class
        float primitiveFloat = 15.5f;
        Float wrapperFloat = Float.valueOf(primitiveFloat); // Autoboxing
        System.out.println("Float Wrapper: " + wrapperFloat);
        float unboxedFloat = wrapperFloat.floatValue(); // Unboxing
        System.out.println("Unboxed Float: " + unboxedFloat);

        // Long Wrapper Class
        long primitiveLong = 100000L;
        Long wrapperLong = Long.valueOf(primitiveLong); // Autoboxing
        System.out.println("Long Wrapper: " + wrapperLong);
        long unboxedLong = wrapperLong.longValue(); // Unboxing
        System.out.println("Unboxed Long: " + unboxedLong);
    }
}