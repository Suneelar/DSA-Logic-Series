// Convert lowecase chacrter to uppercase
// input1:a
// output1:A
import java.util.Scanner;
public class LowerCase {
    public static void main(String[] args) {
        System.out.print("enter the character: ");
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        int ch1=(ch-32);
        char cj=(char)(ch1);
        System.out.println("output:"+cj);

    }
}
