public class secondmin {
    public static void main(String[] args) {
        // second min
        int [] arr={2,3,4,7,1,9};
        int fmin=Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=fmin){
                smin=fmin;
                fmin=arr[i];
            }
        }
        
        System.out.println(smin);

    }
}
