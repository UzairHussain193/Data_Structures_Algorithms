public class TestFabRecursion{
    public static void main(String[] args) {

        for(int i=30;i<=40;i++){
            long t0 =System.currentTimeMillis();
            long m=fab(i);
            long t1=System.currentTimeMillis();
            System.out.println(t1-t0);
        }}}
            long fab(int n){
                if(n<1){
                    return 0;
                }
                if(n<3){
                    return 1;
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
        
        

        // LinkedQueue lq=new LinkedQueue();
        // lq.add("Pakistan");
        // lq.add("India");
        // lq.add("China");
        // System.out.println(lq.first());
        // System.out.println(lq.size());
        // System.out.println(lq.isEmpty());

        // // method to change into array
        // // Object[] a=lq.toArray();
        // System.out.println(lq.toString());
        // // System.out.println(lq.equals(a[2]));


        // removing first element
        // lq.remove();
        // System.out.println(lq.first());









        // ArrayStack a=new ArrayStack(3);
        // LinkedStack l=new LinkedStack();

        // a.push("Apple");
        // a.push("Banana");
        // a.push("Dragon Fruit");

        // l=a.toLinkedStack();
        // System.out.println(l.pop());
        // System.out.println(l.pop());
        // System.out.println(l.pop());

        // l.push("Fruits");
        // l.push("Vegetables");
        // l.push("Shakes");

        // a=l.toArrayStack();
        // System.out.println(a.pop());
        // System.out.println(a.pop());
        // System.out.println(a.pop());
        

    }
}