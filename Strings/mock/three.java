public class three {
    public static void main(String[] args) {
           String str = "Hello World";
        String[] arr = str.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    
    }
}
