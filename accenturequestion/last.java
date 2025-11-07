// Print the third last constant in string
// input1:asdfguihj  output1:g
// input2: hiij      output2:h
public class last {
    public static void main(String[] args) {
        String str="asdfguihj ";
        String str1="hiij";
        String str2=(str.replaceAll("[aeiou]", " "));
        System.out.println();
        System.out.println(str1.replaceAll("[aeiou]", " "));
       
        

    }
}
