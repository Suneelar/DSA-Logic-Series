public class thirdmin {
 public static void main(String[] args) {
       int [] arr={2,4,7,1,9};
        int fmin=Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;
        // int tmin=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=fmin){
                smin=fmin;
                fmin=arr[i];
            }
        }
        System.out.println(smin);
 }   
}
