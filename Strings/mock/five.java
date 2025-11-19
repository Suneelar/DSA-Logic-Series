import java.util.HashMap;
import java.util.Map;

public class five {
 


    public static void main(String[] args) {
        String s = "banana";
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

            map.forEach((a,b)->{
System.out.println(a+" "+b);
            });
        
    }
}



