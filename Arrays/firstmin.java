public class firstmin{
    public static void main(String[] args) {
        int [] arr={9,5,2,3,1,7,1,0};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}