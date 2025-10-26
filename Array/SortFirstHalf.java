import java.util.*;

public class SortFirstHalf {
    public static void main(String[] args) {
        // Sort first half in ascending order and second half in descending
        // - Split the array into two halves.
        // - Sort the first half in ascending order.
        // - Sort the second half in descending order.
        // - Merge them back and print the result.

        int arr[] = { 1, 12, 67, 11, 89, 23, 8, 76 };
        int mid = arr.length / 2;
        // Sort first half ascending
        Arrays.sort(arr, 0, mid);

        // Sort second half descending
        Integer[] secondHalf = new Integer[arr.length - mid];

        for (int i = mid; i < arr.length; i++) {
            secondHalf[i - mid] = arr[i];
        }
        Arrays.sort(secondHalf, Collections.reverseOrder());

        // Merge back
        for (int i = mid; i < arr.length; i++) {
            arr[i] = secondHalf[i - mid];
        }
        // Print result
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
