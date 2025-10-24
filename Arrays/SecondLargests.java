import java.sql.Array;
import java.util.Arrays;

public class SecondLargests {
 public static void main(String[] args) {
    int [] arr={2,4,5,16,7,8};
    int largest=arr[0];
    int SecondLargests;
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
   for(int i=arr.length-2;i>=0;i--){
    if(arr[i]!=largest){
        SecondLargests=arr[i];
        break;
    }
   }
   System.out.println(SecondLargests);
 }   
}
