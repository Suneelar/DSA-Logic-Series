import java.util.*;
public class duplicates {
    public static void main(String[] args) {
        String str="hi hi hello hello java";
        String s[]=str.split(" ");
        Map<String,Integer>map=new LinkedHashMap<String,Integer>();
        for(String str1:s){
            map.put(str1, map.getOrDefault(str1,0)+1);
}
for(Map.Entry<String,Integer>map1:map.entrySet()){
    if(map1.getValue()==1){
System.out.println(map1.getKey()+" "+map1.getValue());
    }
    
}

// map.forEach((a,b)->{
//     System.out.println(a+" "+b);
// });
        }
    }

