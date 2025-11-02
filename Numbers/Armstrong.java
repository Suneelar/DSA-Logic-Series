import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        int num=153;
        int copy=num;
        int num1=num;
        int count=0;
        int sum=0;
        while(num!=0){
            count++;
            num=num/10;
        }
        while(num1!=0){
            int rem=num1%10;
            sum=sum+Math.pow(rem,count);
            num1=num1/10;
        }
        if(copy==sum){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not an armstroong number");
        }
    }
}
