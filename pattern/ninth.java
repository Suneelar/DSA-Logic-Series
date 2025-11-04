public class ninth {
    public static void main(String[] args) {
        // Top half
        for(int row=5; row>=1; row--){
            for(int col=1; col<=row; col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        // Bottom half (mirror of top)
        for(int row=1; row<=5; row++){
            for(int col=1; col<=row; col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

