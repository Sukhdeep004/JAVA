//Question 24
//Convert Celsius to Fahrenheit and print the temperature.
//Given principal, rate, and time, calculate the simple interest for a given amount deposited to bank.


public class Q24{
    public static void main(String[] args) {
        double celsius = 30.0;
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        double principal = 10000;
        double rate = 5.0;
        double time = 2;

        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
