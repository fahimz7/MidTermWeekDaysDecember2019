package problemandsolutions;

import java.util.Scanner;

public class ArraySort {
    // By using the bubble sort algorithm, write a Java program to sort an integer array of 10 elements in ascending.

        public static void main(String[] args) {
            int num, x, y, temp;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter how many integers:");
            num = input.nextInt();
            int array[] = new int[num];
            System.out.println("Enter " + num + " integers: ");
            for (x = 0; x < num; x++)
                array[x] = input.nextInt();
            for (x = 0; x < (num - 1); x++) {
                for (y = 0; y < num - x - 1; y++) {
                    if (array[y] > array[y + 1]) {
                        temp = array[y];
                        array[y] = array[y + 1];
                        array[y + 1] = temp;
                    }
                }
            }
            System.out.println("Order of integers:");
            for (x = 0; x < num; x++)
                System.out.println(array[x]);
        }}

