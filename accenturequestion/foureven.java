// print even odd
// input1:[2,3,4]
//output1:Even oddEven

public class foureven{
    public static void main(String[] args) {
        int [] arr={2,3,4};
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]%2==0){
               System.out.println("Even"); 
            }else{
            System.out.println("odd");
        }
    }
    
    }
}