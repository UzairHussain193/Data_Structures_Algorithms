public class Q1 {
    static int high(int[] arr) {
		int highest=0;
		for(int i =1 ; i<arr.length;i++) {
			if(arr[i]>highest) {
				highest=arr[i];
			}
		}
		return highest;
				}

	   static int sum(int[] arr)
	    {
	        int sum = 0;
	        int i;

	        for (i = 0; i < arr.length; i++)
	            sum += arr[i];

	        return sum;
	    }

	public static void main(String[] args) {
	int[] arr1= {5,7,9,11};
	int[] arr2= {29,35,45};
	int sum1=sum(arr1);
	int sum2=sum(arr2);
	System.out.println("sum of second array is "+sum1+"  Sum of second array is  "+sum2);
	int high1 = high(arr1);
	int high2 = high(arr2);
	if(high1>high2) {
		System.out.println("The highest number among the arrays is "+ high1);
	}
	else {
		System.out.println("The highest number among the arrays is "+ high2);
		
	}
	}

}