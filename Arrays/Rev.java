public class Rev {
    public static void main(String[] args) {
         int []arr={5,4,14,21};
    //       for(int i=arr.length-1;i>=0;i--){
    //         System.out.print(arr[i]+" ");
    // }

    int start=0;
    int end=arr.length-1;
    while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }

    for(int num:arr){
        System.out.print(num+" ");
    }
}
}
