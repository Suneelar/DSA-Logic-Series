import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.*;
public class sam
{
    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Map<Character,Integer>map=new LinkedHashMap<Character,Integer>();
        for(Character s1:str.toCharArray()){
            map.put(s1, map.getOrDefault(s1,0)+1);
        }
        map.forEach((a,b)->{
System.out.println(a+" "+b);
        });
    }
}