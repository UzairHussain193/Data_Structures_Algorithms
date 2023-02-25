interface Stack{
    public Object peek();
    public Object pop();
    public void push(Object obj);
    public int size();
}
public class ArrayStack implements Stack{
    Object[] list;
    int size;
  

    public ArrayStack(int cap){
        list=new Object[cap];
    }
    @Override
    public Object peek() {
        return list[size-1];
    }
    @Override
    public Object pop() {
        Object obj =list[--size];
        list[size]=null;

        return obj;
    }
    void resize(){
        Object[] temp=list;
        list=new Object[2*temp.length];
        System.arraycopy(temp, 0, list, 0, size);
    }
    @Override
    public void push(Object obj) {
        if(size==list.length){
              resize();
        }
        list[size++]=obj;        
    }
    @Override
    public int size() {
        return size;
    }
    
    public  String toString(){
        StringBuilder temp=new StringBuilder("[");
        for(int i=list.length-1;i>=0;i--)
        {
            temp.append(list[i]);
            if(i!=0){
                temp.append(" , ");
            }
        }
        temp.append("]");

        String a=temp.toString();
        return a;

    }
    
    public boolean isEmpty(){
        return (size==0);
    }
    
    void reverse(){
        Object[] temp=new Object[size];
        for(int j=0,i=list.length-1;i>=0;i--,j++){
              temp[i]=list[j];
        }

        System.arraycopy(temp, 0, list, 0, size);
    }

    public LinkedStack toLinkedStack(){
        LinkedStack l=new LinkedStack();
        for(int i=0;i<size;i++){
            l.push(list[i]);
        }

        return l;
    }

}
    

