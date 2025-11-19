import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.*;
public class seven {
   public static void main(String[] args) {
      String s = "java is java and python is python IS";

        Set<String> set = new LinkedHashSet<>(Arrays.asList(s.split(" ")));

        System.out.println(String.join(" ", set));
   }

  
}
