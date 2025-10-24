public class largestEle {
    public static void main(String[] args) {
        int [] arr={2,3,4,9,12,9,12};
        int largest=arr[0];
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}
