package Array_Methods;

public class Search_1D {

     public static int seacrh(int[] arr, int key){
         for(int i=0; i<arr.length; i++) {
             if (arr[i] == key) {
                 return i;

             }
         }
         return -1;
     }

    public static void main(String[] args) {
        int [] arr = {22,33,44,55,66,332};

        System.out.println(seacrh(arr,55));
    }
}
