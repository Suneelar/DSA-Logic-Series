public class HappyNumber {
    static int add(int no){
        int sum=0;
        while(no!=0){
            int rem=no%10;
            sum=sum+rem*rem;
            no=no/10;

        }
        return sum;
        
    }
    public static void main(String[] args) {
        int no=1234;
        while(no>9){
            no = add(no);
            }
            if(no==1|| no==7){
                System.out.println(no+" Is a happy number");
            }else{
                System.out.println(no+" it is not happy number");
            }
        }
    }

