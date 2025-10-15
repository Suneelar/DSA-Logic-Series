import java.util.Set;
import java.util.TreeSet;

public class union {
    public static void main(String[] args) {
        
        int []a1={2,6,4,10,8};
        int []a2={1,2,3,5,7,10};
        Set<Integer>S1=new TreeSet<>();
        for(int x:a1){
            S1.add(x);
        }
        for(int y:a2){
            S1.add(y);
        }
System.out.println(S1);
    }
}
