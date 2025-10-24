public class rotatearray {
    public static void main(String[] args) {
        // rotate an array by 1 place o/p will be 2,3,4,5,1
        int [] arr={1,2,3,4,5};
        int temp=arr[0];
        int n=arr.length-1;
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
    arr[n-1]=temp;
    System.out.println(arr);
    }
}
