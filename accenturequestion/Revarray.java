// input1:{10,20,30,40,50,60}
// output1:120
import java.util.*;
public class Revarray {
public static void main(String[] args) {
           Integer[] arr = {10, 20, 30, 40, 50, 60};
        List<Integer> list = Arrays.asList(arr);
        Collections.reverse(list);

        // Sum even index
        int sum = 0;
        for (int i = 0; i < list.size(); i += 2) {
            sum += list.get(i);
        }
        System.out.println("Output: " + sum);
        }    
}
