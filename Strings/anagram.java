import java.lang.reflect.Array;
import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String str1="race";
        String str2="care";
        if(str1.length()==str2.length()){
char []c1=str1.toCharArray();
char []c2=str1.toCharArray();
Array.getShort(c1, 0);
Array.getShort(c2, 0);

if(Arrays.equals(c1, c2)){
    System.out.println("anagram");
}else{
    System.out.println("mot a anagram");
}
        }else{
            System.out.println("not an anagram");
        }


    }
}
