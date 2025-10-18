public class sam4 {
    public static void main(String[] args) {
        
        // * * * * * i=1  star=5
        // * * * *   i=2  star=4
        // * * *     i=3  star=3
        // * *       i=4  star=2
        // *         i=5  star=1
int n=5;
        for(int i=1;i<=n;i++){
        for(int j=0;j<n-i+1;j++){
System.out.print("*");
        }
        System.out.println();
        }
    }
}
