import java.util.Scanner;

public class Smallestlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("enter the elements in the arry");
        for (int i = 0; i <= size - 1; i++) {
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
                if(arr[i] < largest){
                    smallest = arr[i];
                }
        }
        System.out.println("largest element in the array: "+largest);
        System.out.println("smallest element in the array:" +smallest );

    }
}
