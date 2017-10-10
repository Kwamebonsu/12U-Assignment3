/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bonsk5852
 */
public class A3Q5 {
    // A method that swaps to values

    public void swap(String[] array, int p1, int p2) {
        String temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }

    public void sort(String[] array) {
        // Keep track of which position we are sorting
        for (int position = 0; position < array.length; position++) {
            // go through the rest of the array looking for a words in the wrong order
            for (int i = position + 1; i < array.length; i++) {
                // Have we found one?
                if (array[i].compareToIgnoreCase(array[position]) < 0) {
                    // If yes, swap numbers
                    swap(array, i, position);
                } else if (array[i].compareToIgnoreCase(array[position]) > 0) {
                    // If the words are in the right order do nothing
                } else if (array[i].compareToIgnoreCase(array[position]) == 0) {
                    // If the words are the same do nothing
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create an array
        String numbers[] = new String[11];
        numbers[0] = "Hello";
        numbers[1] = "My";
        numbers[2] = "name";
        numbers[3] = "is";
        numbers[4] = "117";
        numbers[5] = "bOnsu";
        numbers[6] = "Word";
        numbers[7] = "26";
        numbers[8] = "array";
        numbers[9] = "Javelin";
        numbers[10] = "Java";

        // Test the sorting method and output the results
        A3Q5 test = new A3Q5();
        test.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
