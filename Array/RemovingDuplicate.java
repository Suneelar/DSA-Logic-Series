public class RemovingDuplicate {
    public static void main(String[] args) {
        int arr[]={2,3,2,0,8};
        // Removing Duplicate elements from an array
        int n=arr.length-1;
        for(int i=0;i<n;i++){
            if(arr[i]!=arr[i+1]){
                arr[j++]=arr[i];
                arr[j-1]=arr[arr.length-1];
                System.out.println(j);
                
            }
        }
    }
}
