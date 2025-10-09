public class linearSearch{
    public static void main(String[] args) {
        int []arr={2,3,4,6,1,89};
        int search=4;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                System.out.println(arr[i]+"the value is found");
                return;
            }
        }
        System.out.println("Not found");
    }
}