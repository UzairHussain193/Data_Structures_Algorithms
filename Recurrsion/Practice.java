class Methods{
    int sum (int value){
        if(value>0){
            return value+sum(value-1);
        }
        else{
            return 0;
        }
    }
}
    
public class Practice{
    public static void main(String[] args) {
        Methods m = new Methods();
        int a = m.sum(4);
        System.out.println(a);
    }
}
