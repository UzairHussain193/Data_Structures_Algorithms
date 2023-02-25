public class Middle_Min_Array {

        public static void main(String[] args) {

            int[] a = {25, 33, 11, 44, 1, 15, 95};
            int m = a.length/2;
            int middle = a[m];

            int last = a.length-1;
            int lastVal = a[last];

            int min = a[0];
            for(int i=0; i<a.length; i++){
                if(min>a[i]){
                        min=a[i];
                }
            }

            System.out.println("Middle : "+middle);
            System.out.println("Last : "+lastVal);
            System.out.println("Minimum : "+min);

        }

}
