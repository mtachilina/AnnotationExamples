package annotationexamples.builtin;

@FunctionalInterface
interface StringConverter {
    String convert(int number);
}

public class FunctionalInterfaceDemo {
    public static void demo() {
        System.out.println("@FunctionalInterface");
        
        StringConverter converter = num -> "Number: " + num;
        System.out.println(converter.convert(42));
        System.out.println();
    }
}