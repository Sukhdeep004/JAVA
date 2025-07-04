//Question 20
//Create an array of 5 integers and print each element using a loop. Try and find the max element of this array.

public class arraymax {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 34, 23};
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum element is: " + max);
    }
}
