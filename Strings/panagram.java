import java.util.Set;
import java.util.TreeSet;

public class panagram {
    public static void main(String[] args) {
        String str="qwerty uiopjhg fdsazxcvm bnm";
        str=str.replace(" ", "").toLowerCase();
        Set<Character>S1=new TreeSet<Character>();
        for(int i=0;i<str.length();i++){
            S1.add(str.charAt(i));
        }
        if(S1.size()==26){
            System.out.println("anagram");
        }else{
            System.out.println("not an anagram");
        }
    }
}
