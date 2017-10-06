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
        int small = 0;
        // Keep track of which position we are sorting
        for (int position = 0; position < array.length - 1; position++) {
            // go through the rest looking for a smaller number
            for (int i = position + 1; i < array.length; i++) {
                // Have we found the smallest number?
                if (array[i] < array[position]) {
                    small = i;
                } else if (array[position] < array[i]) {
                    small = position;
                }
                // Swap the position
                swap(array, small, position);
            }

        }
    }
// Swap numbers

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

        // Output the numbers in the array before
        System.out.println("BEFORE:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("");
        System.out.println("");

        // and after
        test.sort(numbers);
        System.out.println("AFTER:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
