import java.lang.IllegalStateException;
import java.security.Principal;

interface Stack{
    public Object pop();
    public Object peek();
    public void push(Object obj);
    public int size();
}

public class Q2_A_20SW implements Stack{
    private int size;
    private Object[] a;
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size==0);
    }
    public Q2_A_20SW(int i){
        a=new Object[i];
    }
    public Object peek(){
        if(size==0){
            throw new IllegalStateException();
        }
        return a[size-1];
    }
    public Object pop(){
        if(size==0){
            throw new IllegalStateException();
        }
        Object obj = a[--size];
        a[size]=null;
        return obj;
    }
    public void push(Object obj){
        if(size==a.length){
            resize();
        }
        a[size++]=obj;
    }
    public void resize(){
        Object[] aa=a;
        a=new Object[2*aa.length];
        System.arraycopy(aa, 0, a, 0, size);
    }
    public Stack addAll(Q2_A_20SW stack1,Q2_A_20SW stack2,Q2_A_20SW stack3 ) {
        Q2_A_20SW stack = new Q2_A_20SW(12);
        while (!stack1.isEmpty()){
            stack.push(stack1.peek());
            stack1.pop();
        }
        while (!stack2.isEmpty()){
            stack.push(stack2.peek());
            stack2.pop();
        }
        while (!stack3.isEmpty()){
            stack.push(stack3.peek());
            stack3.pop();
        }
        return stack;
    }
    public void printStack(Q2_A_20SW stack){
        while (!stack.isEmpty()){
            System.out.print(stack.peek()+" , ");
            stack.pop();
        }
    }
    public static void main(String[] args) {
        Q2_A_20SW books=new Q2_A_20SW(4);
        Q2_A_20SW sem1=new Q2_A_20SW(4);
        Q2_A_20SW sem2=new Q2_A_20SW(4);
        Q2_A_20SW sem3=new Q2_A_20SW(4);

        sem1.push("PF");
        sem1.push("Calculus");
        sem1.push("IICT");

        sem2.push("OOP");
        sem2.push("PP");
        sem2.push("ISE");

        sem3.push("DSA");
        sem3.push("SEM");
        sem3.push("SRE");
       
        books.addAll(sem1, sem2, sem3);
        books.printStack(books);      
    }
}
