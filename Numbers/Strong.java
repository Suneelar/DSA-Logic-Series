import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {
       int num=145;
       int sum=0;
int copy=num;
int fact=1;
while(num!=0){
    int rem=num%10;
    sum=sum+fact(num);
    num=num%10;
}
if(num==sum){
    System.out.println("Strong number");
}else{
    System.out.println("not a strong number");
}

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
