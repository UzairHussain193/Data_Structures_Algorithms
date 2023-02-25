package Array_Methods;

public class Delete_Position {
    static int count = 5;

    public static void delete(int[] arr, int val){
        int i;
        for(i=0; i<arr.length; i++){
            if(arr[i]==val)
                break;
        }
        if(i==count){
            System.out.println("Value does not exit:");
            return;
        }
        for(int j=i; j<count-1; j++){
            arr[j]=arr[j+1];
        }
        count--;
    }

    public static void print(int[] arr){
        for(int i=0; i<count; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int [] arr = {33,55,66,11,44};
        delete(arr,33);
        print(arr);
    }

}
