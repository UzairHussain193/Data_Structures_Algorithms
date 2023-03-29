package Finals;

import java.rmi.server.ObjID;

public class LP_Practice {
    int cap;
    int size;
    Object[] keys;
    Object[] values;
    LP_Practice(int cap){
        this.cap=cap;
        keys= new Object[cap];
        values=new Object[cap];
    }
    public int hash(Object key){
        return (key.hashCode() & 0x7FFFFFFF) % cap;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size==0);
    }
    public void hashEmpty(){
        size=0;
        keys= new Object[cap];
        values = new Object[cap];
    }
    public void rehash(){
        int newcap=cap*2;
        Object[] oldkey= keys;
        Object[] oldvalue=values;
        
        keys= new Object[newcap];
        values = new Object[newcap];
        size=0;
        cap= newcap;

        for(int i=0;i<keys.length;i++){
            if(oldkey[i]!=null){
                put(oldkey[i],oldvalue[i]);
            }
        }

    }
    private void put(Object object, Object object2) {
    }

}
