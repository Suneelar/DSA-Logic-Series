import java.util.*;
public class thiretten {

    public static void main(String[] args) {
 String s = "java is java and python is java";
        String[] arr = s.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String w : arr) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

         int max = Collections.max(map.values());

        // Step 2: print using map.forEach
        map.forEach((word, count) -> {
            if (count == max) {
                System.out.println(word); 
                          //System.out.println(word);  // only the most repeated word
            }
        });
        
        
    }
}

