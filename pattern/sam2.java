import java.util.Scanner;
public class sam2 {
    
    public static void main(String[] args) {
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
        System.out.print("enter the number: ");
        Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=1;j<i+1;j++){
System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
