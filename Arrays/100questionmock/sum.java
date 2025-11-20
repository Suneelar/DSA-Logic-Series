public class sum {
  public static void main(String[] args) {
    int []arr={5,4,14,21};
    int sum=0;
    for(int i=0;i<=arr.length-1;i++){
        sum=sum+arr[i];
    }
    System.out.println("sum: "+sum);
  }  
}
