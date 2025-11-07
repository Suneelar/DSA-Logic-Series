public class count {
    public static void main(String[] args) {
       
        String input = "This is A Test STRING  with LOwer Case";
        StringBuilder lowercaseOnly = new StringBuilder();
        int count = 0;
        for (char ch : input.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                lowercaseOnly.append(ch);
                count++;
            }
        }
        System.out.println(lowercaseOnly.toString() + ":" + count);
    }
}

