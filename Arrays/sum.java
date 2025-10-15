public class sum {
    public static void main(String[] args) {
        int [] a1={3,2,4,5,1,6};
        int target=5;
        for(int i=0;i<a1.length;i++){
            for(int j=1;j<a1.length;j++){
                if(a1[i]+a1[j]==target){
                    System.out.println(a1[i]+" "+a1[j]);
                }   
            }
        }
    }
}
