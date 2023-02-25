/*two linkedlist/ arrays {5,7,9,11} & {29,35,45} are populated
 make their sum and find the highest among them
*/


public class Sum_Highest {

//    public static void main(String[] args) {
//        int[] arr1= {5,7,9,11};
//        int[] arr2= {29,35,45};
//        int sum1=sum(arr1);
//        int sum2=sum(arr2);
//        System.out.println("sum of First array is "+sum1+"  Sum of second array is  "+sum2);
//        int high1 = high(arr1);
//        int high2 = high(arr2);
//        if(high1>high2) {
//            System.out.println("The highest number among the arrays is "+ high1);
//        }
//        else {
//            System.out.println("The highest number among the arrays is "+ high2);
//
//        }
//    }

//    static int high(int[] arr) {
//        int highest=0;
//        for(int i =1 ; i<arr.length;i++) {
//            if(arr[i]>highest) {
//                highest=arr[i];
//            }
//        }
//        return highest;
//    }
//
//    static int sum(int[] arr)
//    {
//        int sum = 0;
//        int i;
//
//        for (i = 0; i < arr.length; i++)
//            sum += arr[i];
//
//        return sum;
//    }


    public static int high(int[] arr){
        int highest=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>highest){
                highest=arr[i];
            }
        }
        return highest;
    }

    public static int sum(int [] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+= arr[i];
        }
        return sum;
    }


    public static void main(String[] args) {
        int [] arr1 ={11,22,33,44};
        int [] arr2 = {55,66,77,88};

        int high1 = high(arr1);
        int high2 = high(arr2);

        int sum1 = sum(arr1);
        int sum2 = sum(arr2);

        System.out.println("The sum of Array 1 is : "+sum1);
        System.out.println("The sum of Array 2 is : "+sum2);

        if(high1>high2){
            System.out.println("the highest No: among arrays is : "+high1);
        }
        else
            System.out.println("the highest No: among arrays is : "+high2);
    }
}
