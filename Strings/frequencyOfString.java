import java.util.LinkedHashMap;


public class frequencyOfString {
    public static void main(String[] args) {
        String str="hi how how  are  are yoou";
        Map<String,Integer>m1=new LinkedHashMap<String,Integer>();
        String [] s1=str.split(" ");

        for(String str1:s1){
            Map.put(str1,Map.getorDefault(str1,0)+1);
        }
        Map.forEach((a,b)){
            System.out.println(a+" "+b);
        }
    }
}
