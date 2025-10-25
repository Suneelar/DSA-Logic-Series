import java.lang.reflect.Array;
import java.util.Arrays;

public class rotatearray {
public static void main(String[] args) {
    int [] arr={1,2,3,4,5};
   sam(arr);
}
static void sam(int [] arr){
int temp=arr[0];
int n=arr.length-1;
for(int i=1;i<n;i++){
    arr[i-1]=arr[i];
}
arr[n-1]=temp;
System.out.println(Arrays.toString(arr)); 
}
}
