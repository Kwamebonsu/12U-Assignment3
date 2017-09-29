/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bonsk5852
 */
public class A3Q1 {

    public void swap(int[] array, int p1, int p2) {
        int temporary = array[p1];
        array[p1] = array[p2];
        array[p2] = temporary;
    }

    public void sort(int[] array) {
        // Create a temporary variable
        int base = 0;
        int temp = 0;
        // Keep track of which position we are sorting
        for (int position = 0; position < array.length; position++) {
            // go through the rest looking for a smaller number
            for (int i = position + 1; i < array.length; i++) {
                // Have we found smaller?
                if (array[i] < array[position]) {
                    position = temp;
                }
            }
            swap(array, array[base], array[temp]);

        }
        base = base + 1;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test the method
        A3Q1 test = new A3Q1();
        int[] numbers = new int[10];

        // Fill the array with random numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 101);
        }

        // Output the numbers in the array
        System.out.println("BEFORE:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        test.sort(numbers);
        System.out.println("AFTER:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
