//Question 10
//Convert a float to an integer and print both values. Then convert an integer to a double and print both.

public class Conversion {
    public static void main(String[] args) {
        float Float = 12.75f;
        int convertedInt = (int) Float;

        System.out.println("Float value: " + Float);
        System.out.println("Converted to int: " + convertedInt);

        int Int = 50;
        double convertedDouble = (double) Int;

        System.out.println("Int value: " + Int);
        System.out.println("Converted to double: " + convertedDouble);
    }
}
