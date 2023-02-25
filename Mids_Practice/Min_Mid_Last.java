package Array_Methods;

public class Min_Mid_Last {
//    public static void main(String[] args) {
//
//        int [] arr = {22,33,44,55,66,7,1};
//
//        int m= arr.length/2;
//        int mid = arr[m];
//
//        int l = arr.length-1;
//        int last = arr[l];
//
//        int min = arr[0];
//        for(int i=0; i<arr.length; i++){
//            if(min>arr[i]){
//                min=arr[i];
//            }
//        }
//
//        System.out.println("Middle : "+mid);
//        System.out.println("Last : "+last);
//        System.out.println("Minimum : "+min);
//    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int m=arr.length/2;
        int mid = arr[m];

        int l = arr.length-1;
        int last = arr[l];

        int min=arr[0];
        for(int i=0; i<arr.length; i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }


        System.out.println("Middle : "+mid);
        System.out.println("Last : "+last);
        System.out.println("Minimum : "+min);
    }
}
