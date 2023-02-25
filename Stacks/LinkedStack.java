
public class LinkedStack implements Stack{
    private Node node;
    private int size;
 
    private class Node{
        Object obj;
        Node next;
         
 
        Node(Object object,Node n){
            obj=object;
            next=n;
        }
    }
     @Override
    public Object peek() { 
        return node.obj;
    }
 
    @Override
    public Object pop() {      
        Object o=node.obj;
        node=node.next;
        --size;
        return o;
    }
 
    @Override
    public void push(Object object) {
        node=new Node(object,node);
        size++;    
    }
 
    @Override
    public int size() {
        return size;
    }
 
    boolean isEmpty(){
         return (size==0);
    }
     
    public ArrayStack placing(ArrayStack arr,Object object){
 
        if(arr.isEmpty()){
            arr.push(object);
        }
        else{
            Object temp=arr.pop();
 
            placing(arr, object);
 
            arr.push(temp);
 
        }
 
        return arr;        
    }
 
    public ArrayStack toArrayStack(){
        ArrayStack arr=new ArrayStack(size);
        for(Node temp=node;temp!=null;temp=temp.next){
            arr=placing(arr, temp.obj);
        }
 
    return arr;
    }
     
 }
 