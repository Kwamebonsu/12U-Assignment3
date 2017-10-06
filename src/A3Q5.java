/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bonsk5852
 */
public class A3Q5 {

    public void swap(String[] array, String p1, String p2) {
        String temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }

    public void insertion(String[] array) {
        // Start going through the array
        for (int i = 0; i < array.length - 1; i++) {
            // Store position
            int position = i;
            // Check values beside each other

            if (array[i].compareTo(array[i + 1]) > 0) {
                swap(array, array[i], array[i + 1]);
            }
//            while (position >= 0 && array[position] > array[position + 1]) {
//                // If out of place, swap it downwards until correct position is reached
//                swap(array, position, position + 1);
//                position--;
//            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create an array
        String numbers[] = new String[10];
        numbers[0] = "Hello";
        numbers[1] = "My";
        numbers[2] = "name";
        numbers[3] = "is";
        numbers[4] = "Kwame";
        numbers[5] = "bOnsu";
        numbers[6] = "Word";
        numbers[7] = "letter";
        numbers[8] = "array";
        numbers[9] = "Java";

        // Test the insertion method
        A3Q5 test = new A3Q5();
        test.insertion(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
