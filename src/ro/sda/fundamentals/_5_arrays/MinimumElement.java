package ro.sda.fundamentals._5_arrays;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/*
Write a method called readIntegers() with a parameter called count that represents
how many integers the user need to enter.

The method need to read from the console until all the numbers are entered, and
then return an array containing the numbers entered.

Write a method findMin() with the array as a parameter. The method need to return
the minimum value in the array.

In the main() method read the count from the console and call the method readIntegers()
with the count parameter.

Then call the findMin() method passing the array returned from the call to the
readIntegers() method.
*/
public class MinimumElement {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter count: ");
        int count = scanner.nextInt();

        int[] array = readIntegers(count);
        int minim = findMin(array);

        System.out.println("Minimum is: " + minim);

    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

}
