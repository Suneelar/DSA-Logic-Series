import java.util.Scanner;

public class factor {
 public static void main(String[] args) {
   System.out.println("enter the number: ");
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int x=fact(num);
System.out.println("Factor of the given number:"+ x);
 } 
 static int fact(int num){
 int fact=1;
    for(int i=1;i<=num;i++){
        fact=fact*i;
    }
    return fact;
 }
}