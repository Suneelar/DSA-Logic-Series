public class ten {

    public static void main(String[] args) {
        // Top half
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                if (row <= col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
              for (int col = 1; col <= 5; col++) {
                if (row <= col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        // Bottom half (mirror of top)

    }
}
