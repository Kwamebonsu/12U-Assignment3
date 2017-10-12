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
        // Create a new array
        int[] counter = new int[101];
        // Go through the array
        for (int i = 0; i < counter.length; i++) {
            for (int p = 0; p < array.length; p++) {
                if(array[p] == i){
                    counter[i] = counter[i]++;
                }
            }
        }
        // Count the number of array[1] in the array
        // 
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
