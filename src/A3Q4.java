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

        // Create a tracker array
        int[] counter = new int[101];
        // Go through the array
        for (int i = 0; i < array.length; i++) {
            // Add one to the counter at the appropriate position
            counter[array[i]]++;
        }
        // Output the sorted array
        for (int i = 0; i < counter.length; i++) {
            for (int p = 0; p < counter[i]; p++) {
                System.out.println(i);
            }
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
        // Output the array before
        System.out.println("BEFORE:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        // Output the array after being sorted
        System.out.println("After");
        test.countingSort(array);
    }
}
