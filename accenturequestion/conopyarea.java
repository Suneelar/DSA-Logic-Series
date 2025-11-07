// input1: 5 
// output1:78
import java.util.*;
public class conopyarea {
    public static void main(String[] args) {
        System.out.print("enter the value: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        double res=(3.14*num*num);
        System.out.println((int)Math.round(res));
        // System.out.println(res);
    }
} 