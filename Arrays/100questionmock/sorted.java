
import java.util.*;
public class sorted {
    public static void main(String[] args) {
          int []arr={5,4,14,21};
        //   Arrays.sort(arr);
        //   System.out.println(Arrays.toString(arr));
Boolean isSorted=true;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;

            }

        }
        System.out.println(isSorted);
    }
}
