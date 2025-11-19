import java.util.HashMap;
import java.util.Map;

public class eight {
    public static void main(String[] args) {
          String s = "java is java and python is java";
        String[] arr = s.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String w : arr)
            map.put(w, map.getOrDefault(w, 0) + 1);
map.forEach((a,b)->{
    if(b>1)
    System.out.println(a+" "+b);
});
    }
}
