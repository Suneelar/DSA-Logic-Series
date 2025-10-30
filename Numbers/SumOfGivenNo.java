public class SumOfGivenNo {
   public int sum(int num){
  int sum=0;
        while(num!=0){
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
            return sum;
    }
        public static void main(String[] args) {
              SumOfGivenNo obj = new SumOfGivenNo();
            int x=obj.sum(1234);
            System.out.println(x);
    }
}
