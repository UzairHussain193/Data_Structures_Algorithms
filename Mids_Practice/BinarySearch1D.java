public class BinarySearch1D {

//    public int bsearch(int[]a,int x ){
//        int p=0; int q=a.length-1;
//        while(p<=q){
//            int i=(p+q)/2;
//            if(a[i]==x)
//                return i;
//            else if(a[i]<x)
//                p=i+1;
//            else
//                q=i-1;
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        BinarySearch1D b1 = new BinarySearch1D();
//        int[] a ={1,2,3,4,5,6,7,8,9};
//        System.out.println(b1.bsearch(a,6));
//    }

//    public static int bsearch(int[] arr, int key){
//        int p=0; int q=arr.length-1;
//        while(p<=q){
//            int i=(p+q)/2;
//            if(arr[i]==key)
//                return i;
//            else if(arr[i]<key)
//                p=i+1;
//            else
//                q=i-1;
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        int[] ar = {1,2,3,4,5,6};
//        System.out.println(bsearch(ar,9));
//    }

    public static int search(int[] arr, int key){
        int p=0; int q=arr.length-1;
        while(p<=q){
            int i=(p+q)/2;
            if(arr[i]==key)
                return i;
                else if(arr[i]<key)
                    p=i+1;
                else
                    q=i-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(search(arr,4));
    }
}
