/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bonsk5852
 */
public class A3Q2 {

    public int smallestMissingNumber(int[] array) {
        // Create a variable that goes increases by 1 starting from 0
        int p = 0;
        // Create a boolean to break the loop once the number is found
        boolean found = false;
        while (found == false) {
            // Go through the array
            for (int i = 0; i < array.length; i++) {
                // If the number is found, add 1 to the number and check again
                if (array[i] == p) {
                    p++;
                } // If the number is not found, return that number
                else {
                    found = true;
                }
                // If every number is found in the array, return -1;
                if (p == array[array.length - 1]) {
                    p = -1;
                    found = false;
                }
            }
        }
        // return the missing number
        return p;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a sorted array
        int numbers[] = new int[10];
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[3] = 3;
        numbers[4] = 4;
        numbers[5] = 5;
        numbers[6] = 6;
        numbers[7] = 8;
        numbers[8] = 10;
        numbers[9] = 11;


        // Test the method
        A3Q2 test = new A3Q2();
        int total = test.smallestMissingNumber(numbers);
        System.out.println(total);
    }
}
