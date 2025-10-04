import java.util.Scanner;
public class reverseString {
    public static void main(String[] args) {
        System.out.print("enter the string: ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String empty="";

        for(int i=str.length()-1;i>=0;i--){
            empty=empty+str.charAt(i);
        }
        System.out.println("the reverse string: "+empty);
    }
}
