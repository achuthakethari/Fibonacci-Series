package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        int curr = 1, prev = 0;
        int next = 0;
        int numofelements = 0;

        System.out.println("Enter number of Finonacci elements needed : Min-2, Max-15 : ");
        Scanner sc = new Scanner(System.in);
        numofelements = sc.nextInt();

        // Create an integer array to hold the fibonacii numbers. Array Size is equal to user entered number.
        int[] fibarr = new int[numofelements];
        fibarr[0] = prev; // first element of array is 0
        fibarr[1] = curr; // second element of array is 1

        int index = 2;  //

        while (index < numofelements) {
            next = prev + curr;
            fibarr[index] = next;
            index++;

            prev = curr;
            curr = next;
        }
        System.out.println("First " + numofelements + " elements of Fibonacci series are:");
        for (int i : fibarr)
            System.out.printf("%d, ", i);

    }
}
