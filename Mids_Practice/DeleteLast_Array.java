public class DeleteLast_Array {
   static int count = 0;
    public static void main(String[] args) {
         DeleteLast_Array dl2 = new DeleteLast_Array();
        int[] arr ={1,2,3,4,5,6,7};
         dl2.delete(arr);
         dl2.print(arr);
    }
    public  void delete(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr.length < 0)
                System.out.println("Array is empty:");

            count=arr.length-1;
        }
    }
    public  void print(int[] a) {
        for(int i=0; i<count; i++){
            System.out.print(a[i]+" ");
        }

    }


}
