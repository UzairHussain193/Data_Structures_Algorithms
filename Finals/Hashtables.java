package Finals;

class Hash_Node{
    Object key;
    Object value;
    Hash_Node next;
}
public class Hashtables {
    
    Hash_Node[] table_array;
    int count=0;
    
    Hashtables(int size){
        table_array= new Hash_Node[size];
    }
    public void put(Object key2,Object value2){
        int bucket=hash(key2);
        Hash_Node list= table_array[bucket];
        while(list!=null){
            if(list.key.equals(key2)){
                break;
            }
            list=list.next;
        }
        if(list!=null){
            list.value=value2;
        }
        else{
            if(count>=(0.75*table_array.length)){
                resize();
            }
            Hash_Node newnode= new Hash_Node();
            newnode.key=key2;
            newnode.value=value2;
            newnode.next=table_array[bucket];
            table_array[bucket]=newnode;
            count++;
        }
    }
    public void put_Linear_Probing(Object key2, Object value2) {
        int bucket = hash(key2);
        Hash_Node list = table_array[bucket];
        int i = 0;
        while (list != null) {
            if (list.key.equals(key2)) {
                list.value = value2;
                return;
            }
            i++;
            bucket = (hash(key2) + i) % table_array.length;
            list = table_array[bucket];
        }
        if (count >= (0.75 * table_array.length)) {
            resize();
            put(key2, value2);
        } else {
            Hash_Node newnode = new Hash_Node();
            newnode.key = key2;
            newnode.value = value2;
            table_array[bucket] = newnode;
            count++;
        }
    }
    
    public Object get(Object key){
        int bucket=hash(key);
        Hash_Node list=table_array[bucket];
        while(list!=null){
            if(list.key.equals(key)){
                return list.value;
            }
            list=list.next;
        }
        return null;
    }
    void resize() {
        Hash_Node[] newTable_array = new Hash_Node[table_array.length*2];
        for(int i=0;i<table_array.length;i++){
            Hash_Node list= table_array[i];
            while(list!=null){
                Hash_Node next = list.next;
                int hash=(Math.abs(list.key.hashCode()))%newTable_array.length;
                list.next=newTable_array[hash];
                newTable_array[hash]=list;
                list=next;
            }
        }
        table_array=newTable_array;
    }
    public void display(){
        for(int i=0;i<table_array.length-1;i++){
            System.out.print((i+1)+ " ");
            Hash_Node list= table_array[i];
            while(list!=null){
                System.out.print("( " + list.key + " , " + list.value + " )");
                list=list.next;
            }
            System.out.println();
        }
    }
    public int hash(Object key){
        return (key.hashCode() & 0x7fffffff) %table_array.length;
    }

    public void remove(Object key){
        int bucket=hash(key);
        if(table_array[bucket]==null){
            return;
        }
        if(table_array[bucket].key.equals(key)){
            table_array[bucket]=table_array[bucket].next;
            count--;
            return;
        }
        Hash_Node prev = table_array[bucket];
        Hash_Node curr = prev.next;
        while(curr != null && curr.key.equals(key)){
            curr=curr.next;
            prev=curr;
        }
        if(curr!=null){
            prev.next=curr.next;
            count--;
        }
    }
    public boolean contains(Object key){
        int bucket=hash(key);
        Hash_Node list = table_array[bucket];
        while(list!=null){
            if(list.key.equals(key)){
                return true;
            }
            list=list.next;
        } 
        return false;
    }
    public static void main(String[] args) {
        Hashtables a = new Hashtables(5);
        Object[] values={"A","B","C","D","E"};
        Object[] keys={1,2,3,4,5};

        for(int i=0;i<keys.length;i++){
            a.put(keys[i], values[i]);
        }
        System.out.println(a.get("C"));
        // a.remove("C");
        System.out.println(a.contains("F"));
        // System.out.println(a.get("C"));
        a.display();


    }
}


