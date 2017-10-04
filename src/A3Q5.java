/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bonsk5852
 */
public class A3Q5 {

    public void swap(int[] array, int p1, int p2) {
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }

    public void insertion(int[] array) {
        // Start going through the array
        for (int i = 0; i < array.length - 1; i++) {
            // Store position
            int position = i;
            // Check values beside each other
            while (position >= 0 && array[position] > array[position + 1]) {
                // If out of place, swap it downwards until correct position is reached
                swap(array, position, position + 1);
                position--;
            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numbers[] = new int[10];
        numbers[0] = 0;
        numbers[1] = 11;
        numbers[2] = 8;
        numbers[3] = 4;
        numbers[4] = 7;
        numbers[5] = 3;
        numbers[6] = 6;
        numbers[7] = 9;
        numbers[8] = 1;
        numbers[9] = 11;

        A3Q5 test = new A3Q5();
        test.insertion(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
