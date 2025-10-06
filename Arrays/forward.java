import java.lang.reflect.Array;
import java.util.*;
public class forward{
    public static void main(String[] args) {
        int []arr={10,20,3,40,50,60};

        // foward and backward
        // for(int i=0;i<arr.length;i++){
        //     System.out.print("Forward"+arr[i]);
        // }

//even index/odd index
        // for(int j=0;j<arr.length;j++){
        //     if(j%2==0){
        //         System.out.println("Even index"+arr[j]);
        //     }else{
        //         System.out.println("odd index"+arr[j]);
        //     }
        // }
        //even element/odd element
//  for(int j=0;j<arr.length;j++){
//             if(arr[j]%2==0){
//                 System.out.println("Even index"+arr[j]);
//             }else{
//                 System.out.println("odd index"+arr[j]);
//             }
//         }
// int []a={2,3,4,5};
    //   System.out.println(Arrays.toString(a));

    //   sort the array
    // int [] arr1={42,25,46,89,9,8,2,3,4};
    // Arrays.sort(arr1);
    // System.out.println(Arrays.toString(arr1));

   int[] arr2={2,3,4,5,5,6,7,78};
   Arrays.sort(arr2);
   System.out.println(Arrays.toString(arr2));
     System.out.println(Arrays.binarySearch(arr2,3));

    }
}