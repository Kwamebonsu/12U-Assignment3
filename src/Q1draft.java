/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bonsk5852
 */
public class Q1draft {

    public void sort(int[] array) {
        int lowest = 0;
        for(int i = 0; i<array.length - 1; i++){
            if(array[i] < array[i+1]){
                lowest = i;
            }
            else if(array[i +1] < array[i]){
                lowest = i+1;
            }
        }
        System.out.println("hoii" + array[lowest]);
    }

        /**
         * @param args the command line arguments
         */
    

    public static void main(String[] args) {
        // Test the method
        Q1draft test = new Q1draft();
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
