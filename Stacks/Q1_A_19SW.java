public class Q1_A_19SW{
    public static int BSearch(int[] arr,int x){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(x==arr[mid]){
                return mid;
            }else if(arr[mid]<x){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a={43,45,53,56,67,73,75,77,89,95};

        System.out.println(BSearch(a, 95));
        System.out.println(BSearch(a, 47));

        
    }
}