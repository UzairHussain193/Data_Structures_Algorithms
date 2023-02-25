import java.io.IOException;

interface Stack{
    public Object peak();
    public Object pop();
    public void push(Object O);
    public int Size();
}

class ArrayStack implements Stack{
    private Object[] a;
    private int size, cap;

    public ArrayStack(int c){
        cap=c;
        a=new Object[c];
    }

    public boolean isEmpty(){
        return (size==cap);
    }

    //Equals Method
    public boolean equals(ArrayStack s){
       if(this.Size()==s.size){
        for(int i=0;i<size;i++){
            if(this.a[i]!=s.a[i]){
                return false;
            }
        }
        return true;
       }
       return false;
    }

    //ToString Method
    public String toString () {
        int i=0;
        String temp="[";
        while(a[i]!=null){
            if((i+2)==a.length){
                temp+=(String)a[i] + " ";

                i++;
                break;
            }
            temp+=(String)a[i] + ", ";

            i++;
        }
        temp+="]";

        return temp;
    }

    //Remove method
    public Object remove(){
        Object[] temp=a;
        Object obj=a[0];
        a=new Object[size];
        System.arraycopy(temp, 1, a, 0, size);
        return obj;
    }

    // peak the last 

    public Object peak(){

        if(size==0){

            try {
                throw new Exception();
            } 
            catch (Exception e) {

            }
        }

        return a[size-1];
    }

    public Object pop(){
        Object obj=a[--size];   // first reducing size then poping out
        a[size]=null;
        return obj;
    }

    public void push(Object O){
        if(size==a.length){
            resize();
        }
        a[size++]=O;    // increse size after pushing object 
    }

    public int Size(){
        return size;
    }
    public void deleteLast(){
        System.arraycopy(a, 1, a, 0, size-1);
    }

    public void resize(){
        Object[] aa = a;
        a=new Object[2*aa.length];
        System.arraycopy(aa, 0, a, 0, size);
    }
    public void reverseStack(ArrayStack s){
        Object[] temp=s.a;
        int j=temp.length;
        for(int i=0;i<temp.length;i++){
            temp[j-1]=s.a[i];
            j=j-1;
        }
       
        // System.arraycopy(, size-1, a, 0, --size);
    }
}

public class Stack_HW {
    public static void main(String[] args) {
        ArrayStack Fruit_Crates=new ArrayStack(6);
        Fruit_Crates.push("Apples");
        Fruit_Crates.isEmpty();
        Fruit_Crates.push("Kiwis");
        Fruit_Crates.push("DragonFruit");
        System.out.println(Fruit_Crates.peak());
        Fruit_Crates.pop();
        System.out.println(Fruit_Crates.peak());
        Fruit_Crates.push("Pomegrante");
        Fruit_Crates.push("Grapes");
        Fruit_Crates.push("Peach");
        Fruit_Crates.push("Orange");
        Fruit_Crates.push("Banana");

        Fruit_Crates.remove();
        Fruit_Crates.deleteLast();
        System.out.println(Fruit_Crates);
    }
}