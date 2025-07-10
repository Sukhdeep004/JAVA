//Question 23
//Take two numbers and print their sum, difference, product, and quotient.
//Take three subject marks as integers, calculate and print the average using floating-point division.


public class Q23{
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 5;

        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));
        System.out.println("Quotient: " + ((double) num1 / num2));

        int mark1 = 85;
        int mark2 = 90;
        int mark3 = 80;

        float average = (mark1 + mark2 + mark3) / 3.0f;
        System.out.println("Average marks: " + average);
    }
}
