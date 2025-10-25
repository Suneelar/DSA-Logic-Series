import java.util.Scanner;
public class secondlar {
    public static void main(String[] args) {
        // Find Second Smallest Element in an Array
        int [] arr={34,34,4,6,78};
     int smallest=Integer.MAX_VALUE;
        int secondsmallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
               smallest=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smallest && arr[i]<secondsmallest){
                secondsmallest=arr[i];
            }
        }
        if(secondsmallest ==Integer.MAX_VALUE){
            System.out.println("not found");
        }else{
System.out.println("secondsmallest: "+secondsmallest);
        }
               
    }
}
