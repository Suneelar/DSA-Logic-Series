

public class Count {
    public static void main(String[] args) {
        int []arr={5,4,14,21,14,14};
        int targest=14;
        int count=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==targest){
count++;

            }
        }
        System.out.println(count);
    }
}
