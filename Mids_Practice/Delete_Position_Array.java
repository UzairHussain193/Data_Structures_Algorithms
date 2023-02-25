public class Delete_Position_Array {
        static int count = 7;
        public static void main(String[] args) {
            Delete_Position_Array dl2 = new Delete_Position_Array();
            int[] arr ={1,2,3,4,5,6,7};
             dl2.deletePosition(arr,4);
            dl2.print(arr);
        }
       public void deletePosition(int[] arr, int val){
            int i;
            for( i=0; i<arr.length; i++){
                if(arr[i]==val)
                    break;

            }
            if(i==count){
                System.out.println("Value does not exits:");
                return;
            }
            for(int j=i; j<count-1; j++){
                arr[j]=arr[j+1];
            }
            count--;

       }
        public  void print(int[] a) {
            for(int i=0; i<count; i++){
                System.out.print(a[i]+" ");
            }

        }




}
