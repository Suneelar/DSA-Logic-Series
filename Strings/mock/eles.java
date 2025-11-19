public class eles {
    public static void main(String[] args) {
      String s = "HeLLo WoRLd";
        StringBuilder res = new StringBuilder();

        for (char ch : s.toCharArray()) {

            // lowercase → uppercase
            if (ch >= 'a' && ch <= 'z') {
                res.append((char)(ch - 32));
            }

            // uppercase → lowercase
            else if (ch >= 'A' && ch <= 'Z') {
                res.append((char)(ch + 32));
            }

            // for spaces or other characters
            else {
                res.append(ch);
            }
        }

        System.out.println(res);
}
}

