//Question 25
//Write a Java program that takes a number and checks whether it is even or odd using operators.
//Take two numbers and print the greater one. If they are equal, print "Both are equal".


public class Q25
{
    public static void main(String[] args) {
        int number = 7;

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        int num1 = 15;
        int num2 = 20;

        if (num1 > num2) {
            System.out.println("Greater number is: " + num1);
        } else if (num2 > num1) {
            System.out.println("Greater number is: " + num2);
        } else {
            System.out.println("Both are equal.");
        }
    }
}
