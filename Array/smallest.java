import java.util.Scanner;
public class smallest {
    public static void main(String[] args) {
        // Find Smallest Element in an Array 

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        System.out.print("enter the samllest element: ");
        for(int i=0;i<=size-1;i++){
            arr[i]=sc.nextInt();
        }
        int samll=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<samll){
                samll=arr[i];
            }
        }
        System.out.println("Samllest number in the array: "+samll);
    }
}
