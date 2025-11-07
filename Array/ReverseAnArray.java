import java.util.Arrays;
import java.util.*;

public class ReverseAnArray {
    public static void main(String[] args) {
        // to reverse an array o(n)
        System.out.print("Original array: ");
        List<Integer> L1 = Arrays.asList(10, 20, 30);
        System.out.println(L1);
        Collections.reverse(L1);
        System.out.println("Reversed Array: "+L1);

// method-2 to reverse an array TC 0(n)
        // int[] arr = { 2, 3, 5, 6, 7 };
        // System.out.println("Original array: "+Arrays.toString(arr));
        // int start = 0;
        // int end = arr.length - 1;
        // while (start < end) {
        //     int temp = arr[start];
        //     arr[start] = arr[end];
        //     arr[end] = temp;
        //     start++;
        //     end--;
        // }
        // System.out.println("Reversed Array: "+Arrays.toString(arr));
    }
}
