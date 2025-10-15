import java.lang.reflect.Array;
import java.util.*;
public class Sample {
    public static void main(String[] args) {
        String str1="race";
        String str2="care";

        if(str1.length()==str2.length()){
char [] ch1=str1.toCharArray();
char [] ch2=str2.toCharArray();
Array.getShort(ch1, 0);
Array.getShort(ch2, 0);
if(Arrays.equals(ch1,ch2)){
    System.out.println("anaggram");
}else{
    System.out.println("not an anagram");
}

        }else{
            System.out.println("Not an anagram");
        }

    }
}
