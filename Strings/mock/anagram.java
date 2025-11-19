import java.util.Arrays;
public class anagram {
  

    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "case";
        if (str1.length() == str2.length()) {
            char[] c1 = str1.toCharArray();
            char[] c2 = str2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            if (Arrays.equals(c1, c2)) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not an anagram");
            }
        } else {
            System.out.println("Not an anagram");
        }
    }
}

