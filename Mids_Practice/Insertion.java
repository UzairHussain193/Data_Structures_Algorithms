package Array_Methods;

import java.util.Scanner;

public class Insertion {

//        public static void main(String[] args) {
//            Scanner sc=new Scanner(System.in);
//            // Declaration
//            int n,m,p;
//            System.out.println("enter thr size of array");
//            n=sc.nextInt();
//
//            //first array
//            int a[]=new int[n];
//            // new array
//            int b[]=new int[n+1];
//
//            System.out.println("Enter values");
//            for(int i=0;i<n;i++){
//                a[i]=sc.nextInt();
//            }
//            System.out.println("enter the index of new value to be inserted :");
//            m=sc.nextInt();
//            System.out.println("Enter the new value to be inserted ");
//            p=sc.nextInt();
//            for(int i=0;i<n+1;i++){
//                if(i<m){
//                    b[i]=a[i];
//                }
//                else if(i==m){
//                    b[i]=p;
//                }
//                else {
//                    b[i]=a[i-1];
//                }
//            }
//            System.out.println("elements are ");
//            for(int i=0;i<n+1;i++){
//                System.out.print(b[i]+" ");
//            }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size,index,count;
        System.out.println("Enter the size of Array:");
        size = sc.nextInt();

        int[] a = new int[size];
        int[] b = new int[size+1];

        System.out.println("Enter the elements: ");
        for(int i=0; i<size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the index of new element");
        index = sc.nextInt();

        System.out.println("Enter the new value:");
        count = sc.nextInt();
        for(int i=0; i<size+1; i++){
            if(i<index) {
                b[i] = a[i];
            }
            else if(i==index){
                b[i] = count;
            }
            else
                b[i]=a[i-1];
        }
        System.out.println("Elements are: ");
        for(int i=0; i<b.length; i++){
            System.out.print(b[i]+" ");
        }
    }
        }

