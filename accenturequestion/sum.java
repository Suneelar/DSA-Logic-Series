// Sum is equal to 18
// intput1: {11,1,2,8,10,11,15,7}
// output1: {10,8}
public class sum {
    public static void main(String[] args) {
        int sum=0;
        int [] arr={11,1,2,8,10,11,15,7};
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
if(arr[i]+arr[j]==18){
System.out.println(arr[i]+" "+arr[j]);
            }
            }
             
        }
    }
}
