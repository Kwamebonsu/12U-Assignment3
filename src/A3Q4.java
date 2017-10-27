/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bonsk5852
 */
public class A3Q4 {
    // Create a method

    public void countingSort(int[] array) {
        // Create a new array and fill it with 0s
        int[] counter = new int[101];
        for (int i = 0; i < counter.length; i++) {
            counter[i] = 0;
        }
        // Go through the array
        for (int i = 0; i < counter.length; i++) {

            // Compare the number at position p to i.
            for (int p = 0; p < array.length; p++) {
                if (i == array[p]) {
                    counter[i]++;
                }
            }
        }
        // Count the number of array[1] in the array

        // Output the sorted array
        for (int i = 0; i < counter.length; i++) {
            System.out.println("Kwame " + array[i]);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test the method
        A3Q4 test = new A3Q4();

        // Create an array
        int[] array = new int[100];
        // Fill the array with random numbers
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }
        System.out.println("BEFORE:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        test.countingSort(array);
    }
}
