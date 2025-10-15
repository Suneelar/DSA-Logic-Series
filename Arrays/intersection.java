import java.util.ArrayList;
import java.util.Arrays;

public class intersection {
 public static void main(String[] args) {
      int []a1={2,6,4,10,8};
        int []a2={1,2,3,5,7,10};
        for(int i=0;i<a1.length;i++){
            for(int j=0;j<a2.length;j++){
                if(a1[i]==a2[j]){
                    System.out.print(a2[j]+" ");
                }
            }
        }
        // second way using collections

        // ArrayList<Integer>X1=new ArrayList<>(Arrays.asList(1,2,3,4));


 }   
}
