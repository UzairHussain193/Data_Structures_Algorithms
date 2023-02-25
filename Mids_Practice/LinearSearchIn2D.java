public class LinearSearchIn2D {

    public int[] Search(int[][] arr, int key){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]==key){
//                    return new int[]{i,j};
                    System.out.println("found");
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        LinearSearchIn2D l2d = new LinearSearchIn2D();
        int[][] aa = {{3,4,5},{99,88,78} };
        int key=3;
        System.out.println(l2d.Search(aa,key));
    }
}
