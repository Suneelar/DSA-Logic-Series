// Print the third last constant in string
// input1:asdfguihj  output1:g
// input2: hiij      output2:h

import java.util.Scanner;

public class last {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        String con = input.replaceAll("(?i)[aeiou]", "")
        .replaceAll("[^a-zA-Z]", "");

        if (con.length() >= 3) {
          
            char thirdLast = con.charAt(con.length() - 3);
            System.out.println("Output: " + thirdLast);
        } else if (con.length() > 0) {
          
            char first = con.charAt(0);
            System.out.println("Output: " + first);
        } 
}
}