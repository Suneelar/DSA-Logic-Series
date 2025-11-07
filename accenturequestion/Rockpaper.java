// input1:rock output1:paper
// input2:scissors output2:rock

import java.util.Scanner;

public class Rockpaper {
    public static void main(String[] args) {
System.out.println("enter the input");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(str.equals("rock")){
            System.out.println("Paper");
        }else if(str.equals("scirrors")){
            System.out.println("rock");
        } else{
            System.out.println("Invalid ");
        }
    }
}
