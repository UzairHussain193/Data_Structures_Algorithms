public class ResizeArray {



    public int[] resize(int[]arr, int n){
        if(n<arr.length)
            throw new IllegalArgumentException();

        int [] aa = new int [n];
        System.arraycopy(arr,0,aa,0, aa.length);
        return aa;

    }

    public static void main(String[] args) {
        ResizeArray ar = new ResizeArray();
        int [] arr = {1,2,3,4,5};
        int n=5;
        System.out.println(ar.resize(arr,n));
    }
}
