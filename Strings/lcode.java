public class lcode{
    public static void main(String[] args) {
        String str="The sky is blue";
        String arr[]=str.split(" ");
        for(int i=arr.length-1;i>=0;i--){
System.out.print(arr[i]+" ");
        }
    }
}