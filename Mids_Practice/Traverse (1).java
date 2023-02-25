package Array_Methods;

public class Traverse {

    public static void traverse(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};

        traverse(arr);

    }
}
