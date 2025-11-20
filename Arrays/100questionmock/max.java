public class max {
   public static void main(String[] args) {
    int []arr={5,4,14,21};
    int largest=arr[0];
    for(int i=1;i<=arr.length-1;i++){
        if(arr[i]>largest){
            largest=arr[i];
        }
    }
    System.out.println("largest: "+largest);
   } 
}
