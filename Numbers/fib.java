public class fib {
    public static void main(String[] args) {
        int f1=0;
        int f2=1;
        int f3=0;
        int range=10;
        System.out.println(f1);
        System.out.println(f2);
        for(int i=2;i<=range;i++){
            f3=f1+f2;
            System.out.println(f3);
            f1=f2;
            f2=f3;

        }
    }
}
