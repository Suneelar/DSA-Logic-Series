public class min {
    public static void main(String[] args) {
           int [] arr={2,3,4,5,0};
    int samallest=arr[0];
    for(int i=1;i<=arr.length-1;i++){
        if(arr[i]<samallest){
            samallest=arr[i];
        }
    }
    System.out.println("samallest: "+ samallest);
    }
 
}
