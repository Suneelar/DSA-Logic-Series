public class firstNonrepeated{
    public static void main(String[] args) {
            String str = "MetaAI";
        for (char c : str.toCharArray()) {
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                System.out.println("First non-repeated char: " + c);
                break;
            }
        }
    }
}