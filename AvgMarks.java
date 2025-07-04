//Question 12
//⁠Take three subject marks as integers, calculate and print the average using floating-point division.


import java.util.Scanner;

public class AvgMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter mark for Subject 1: ");
        int mark1 = scanner.nextInt();

        System.out.print("Enter mark for Subject 2: ");
        int mark2 = scanner.nextInt();

        System.out.print("Enter mark for Subject 3: ");
        int mark3 = scanner.nextInt();

        float average = (mark1 + mark2 + mark3) / 3.0f;

        System.out.println("Average mark: " + average);

        scanner.close();
    }
}
