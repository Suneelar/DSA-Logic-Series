import java.util.*;
public class duplicate {
    public static void main(String[] args) {
    //    int [] arr={1,2,3,41,23,4,};
    //    Set<Integer>S1=new TreeSet<Integer>();
    //    for(int no:arr){
    //     S1.add(no);
    //    }
    //    System.out.println(S1);

//     String str=("METHODOVERLOADING");
//     char ch[]=str.toCharArray();
//     Set<Character>c=new LinkedHashSet<Character>();
//   for(int i=0;i<ch.length;i++){
// c.add(ch[i]);
//   }
//   System.out.println(c);


String words= ("hi hi hello how are are you");
String w[]=words.split(" ");
    Set<String>c=new LinkedHashSet<String>();
  for(int i=0;i<w.length-1;i++){
c.add(w[i]);
  }
System.out.println(c);
    }
}
