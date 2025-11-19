import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class six {
public static void main(String[] args) {
      

         String[] arr1 = {"java", "python", "java"};
        Set<String> set = new LinkedHashSet<>(Arrays.asList(arr1));
        System.out.println(set);
}    
}
