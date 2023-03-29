package Finals;

import java.util.Scanner;

public class Recursion {
    public long fibonacci(int n){
        // takes less time
        if(n<=1){
            return n;
        }
        return (fibonacci(n-1)+fibonacci(n-2));
    }
    public long fibonacci2(int n){
        // taking more time then previous one
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return (fibonacci(n-1)+fibonacci(n-2));
        }   
    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        Recursion r = new Recursion();
        Scanner s = new Scanner(System.in);
        long t1=0,t2=0;

        // t1=System.currentTimeMillis()*100;
        // for(int i=0;i<30;i++){
        //     // r.fibonacci(i);
        //     System.out.print(r.fibonacci(i)+" ");
        // }
        // t2=System.currentTimeMillis()*100;
        // System.out.println("\nTime taken in sec: "+(t2-t1));
        // t1=System.currentTimeMillis()*100;
        // for(int i=0;i<30;i++){
        //     // r.fibonacci(i);
        //     System.out.print(r.fibonacci2(i)+" ");
        // }
        // t2=System.currentTimeMillis()*100;
        // System.out.println("\nTime taken in sec: "+(t2-t1));
       
        // Q 1 20SW finals
        t1=System.currentTimeMillis()*100;
        for(int i=125;i<=135;i++){
            int a = factorial(i);
            System.out.println("Factorial of "+i+"  is : "+a);
        }
        t2=System.currentTimeMillis()*100;
        System.out.println("\nTime taken in sec: "+(t2-t1));
        // System.out.print("Enter number for factorial: ");
        // int a = s.nextInt();
        // System.out.println(factorial(a));


    }
}
