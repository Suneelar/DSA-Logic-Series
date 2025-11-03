// Rotate array 
// {1,2,3}
// {3,2,1}
public class RotateArra{
    public static void main(String[] args) {
     int arr[]={1,2,3,4,5,6};
     int k=1;
    }
       public void rotate(int arr[],int k){
        if(k>arr.length){
            k=k%arr.length;

            int []result=new int[arr.length];

            for(int i=0;i<k;i++){
                result[i]=arr[arr.length-k+i];
            }
            int j=0;
            for(int i=k;i<arr.length;i++){
result[i]=arr[j];
j++;
            }
            System.arraycopy(result, 0, arr, 0, arr.length);
        }

        }
}