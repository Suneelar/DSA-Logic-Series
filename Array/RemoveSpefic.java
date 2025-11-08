import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveSpefic {
    public static void main(String[] args) {
        //  Remove specific element from array
        int[] arr={25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int removeIndex=5;
        for(int i=removeIndex;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        System.out.println(Arrays.toString(arr));

    }
}
