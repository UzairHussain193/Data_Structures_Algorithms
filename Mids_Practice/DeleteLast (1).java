package Array_Methods;

public class DeleteLast {
//    static int count = 0;
//    public static void delete(int[] arr){
//        for(int i=0; i<arr.length; i++){
//            if(arr.length<0) {
//                System.out.println("Array is empty:");
//            }
//            count = arr.length-1;
//        }
//    }
//
//    public static void print(int[] arr){
//        for(int i=0; i<count; i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//
//    public static void main(String[] args) {
//        int [] arr = {1,2,3,4,5,6,7};
//        delete(arr);
//        print(arr);
//    }

    static  int count=0;
    public static void delete(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr.length<0){
                System.out.println("Array is empty:");
            }

            count = arr.length-1;
        }
    }

    public static void print(int[] arr){
        for(int i=0; i<count; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        delete(arr);
        print(arr);
    }
}
