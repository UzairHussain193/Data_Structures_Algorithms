import javax.xml.transform.Source;

class Practice{
    public int[] Bubble(int[] arr){
            for (int i=0; i< arr.length; i++){
                for (int j=0; j< arr.length-1; j++){        
                    if (arr[j]>arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            return arr;
    }
}
public class Sort {

    int [] array = {4, -6, 5, 7, 8, 9, 1, 10, -9};
    Practice p=new Practice();

    

    
 
}