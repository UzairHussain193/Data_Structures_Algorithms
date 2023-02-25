public class LinearSearchArrray {

    public  int search(int[] arr, int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
    LinearSearchArrray li = new LinearSearchArrray();
        int [] arr = {2,3,45,66,77};
        int key=6;
        System.out.println(li.search(arr,key));
    }
}
