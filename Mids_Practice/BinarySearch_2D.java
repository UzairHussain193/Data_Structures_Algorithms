package Array_Methods;

public class BinarySearch_2D {

    public static int[] search(int[][] arr, int key){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; i++){
                if(arr[i][j]==key)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
             int key = 2;
        System.out.println(search(arr,key));
    }
}
