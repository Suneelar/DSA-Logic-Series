import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        // Find Largest element in an array
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array size: ");
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.print("Enter the array elements: ");
        for(int i=0;i<=size-1;i++){
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];

            }
            
        }
        System.out.println("Largest array is:"+largest);
    }
}
