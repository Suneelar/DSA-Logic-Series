import java.util.Arrays;

public class merge{
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int []arr2={4,5,6,7};
        int []temp=new int[arr.length+arr2.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            temp[j]=arr[i];
            j++;
        }
        for(int i=0;i<arr2.length;i++){
            temp[j]=arr2[i];
            j++;
        }
        Arrays.sort(temp);
        System.out.println(Arrays.toString(temp));
    }
}