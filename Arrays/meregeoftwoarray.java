public class meregeoftwoarray{
    public static void main(String[] args) {
        int [] arr1={1,2,3,4};
        int [] arr2={2,3,4,5};
        int []temp=new int[arr1.length+arr2.length];
        System.arraycopy(arr1, 0, temp, 0, arr1.length);
        System.arraycopy(arr2, 0, temp, arr1.length, arr2.length);
        System.out.println(tmep);
    }
}