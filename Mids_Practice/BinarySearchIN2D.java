public class BinarySearchIN2D {
//    public int[] search(int[][] arr,int key){
//        int r=0;
//        int c=arr.length-1;
//        while(r<arr.length && c>=0){
//            if(arr[r][c]==key)
//                return new int[]{r,c};
//            else if(arr[r][c]<key)
//                r++;
//            else
//                c--;
//
//
//        }
//        return new int[]{-1,-1};
//    }
//
//    public static void main(String[] args) {
//        BinarySearchIN2D b2 = new BinarySearchIN2D();
//        int[][] a= {{1,2,3,4},{5,6,7,8}};
//        int key =33;
//        System.out.println(b2.search(a,key));
//    }

    public static int[] search(int[][] arr, int key){
        int r=0; int c=arr.length-1;
        while(r<arr.length && c>=0){
            if(arr[r][c]==key)
                return new int[]{r,c};

            else if(arr[r][c]<key)
                r++;
            else
                c--;
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        int key = 5;
        System.out.println(search(arr,key));
    }
}
