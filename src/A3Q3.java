/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bonsk5852
 */
public class A3Q3 {

    public int countOnes(int array[], int startPosition) {
        // Create a variable that counts the number of ones
        int counter = 0;
        // Go through the array looking for 1s
        for (int i = 0; i < array.length; i++) {
            // If a 1 is found add it to the counter
            if (array[i] == 1) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create an array
        int numbers[] = new int[7];
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 0;
        numbers[3] = 1;
        numbers[4] = 1;
        numbers[5] = 0;
        numbers[6] = 0;

        // Test the method
        A3Q3 test = new A3Q3();
        int total = test.countOnes(numbers, 0);
        System.out.println(total);
    }
}
