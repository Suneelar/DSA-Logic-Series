import java.util.Scanner;
public class countwords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter word: ");
        String word=sc.nextLine();
        System.out.println(word.length());
    }
}