public class Test_Fabonacci_Recurrsion{
    long fab(int n){
        if(n<1){
            return 0;
        }
        if(n<3){
            return 1;
        }
        return (fab(n-1)+fab(n-2));
    }
    long fab1(int n){
       if(n<=1){
        return n;
       }
        return (fab(n-1)+fab(n-2));
    }
    public long fab2(int n){
        if(n<2){
            return n;
        }
        long f0=0,f1=1,f2=1;
        for(int i=2;i<n;i++){
            f0=f1;
            f1=f2;
            f2=(f1+f0);
        }
        return f2;
    }
    int sum (int value){
        if(value>0){
            return value+sum(value-1);
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Test_Fabonacci_Recurrsion a=new Test_Fabonacci_Recurrsion();
        long t0=0,t1=0;
        long sum=0;
        t0 =System.currentTimeMillis();
        for(int i=0;i<=30;i++){
            long m=a.fab1(i);
            sum+=m;
            System.out.print(m+" ");
        }
        t1=System.currentTimeMillis();
        System.out.println("\n\nSum : "+ sum );
        System.out.println("Time taken : "+ (t1-t0) + " milliseconds");
        // int aa=a.sum(4);
        // System.out.println(aa);
    }
}