    import java.util.*;
public class sort {


 public static void main(String[] args) {
    System.out.println("enter the size");
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
System.out.println("enter the values: ");
    int arr[]=new int[size];
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
 }   
}


