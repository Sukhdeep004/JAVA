//Question 22
//Declare one variable of each primitive type (int, float, double, char, boolean). Assign values and print them.
//Convert a float to an integer and print both values. Then convert an integer to a double and print both.


public class Q22 {
    public static void main(String[] args) {
        int myInt = 42;
        float myFloat = 3.14f;
        double myDouble = 76.81;
        char myChar = 'A';
        boolean myBoolean = true;

        System.out.println("Integer: " + myInt);
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);
        System.out.println("Character: " + myChar);
        System.out.println("Boolean: " + myBoolean);

        int floatToInt = (int) myFloat;
        System.out.println("Original float: " + myFloat);
        System.out.println("Converted to int: " + floatToInt);

        double intToDouble = (double) myInt;
        System.out.println("Original int: " + myInt);
        System.out.println("Converted to double: " + intToDouble);
    }
}
