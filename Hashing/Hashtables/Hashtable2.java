public class Hashtable2 {
    static class Node{
        Object key;
        Object value;
        Node next;
    }
    Node[] table_array;
    int count=0;
    
    Hashtable2(int size){
        table_array= new Node[size];
    }
    public void put(Object key2,Object value2){
        int bucket=hash(key2);
        Node list= table_array[bucket];
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
            Node newnode= new Node();
            newnode.key=key2;
            newnode.value=value2;
            newnode.next=table_array[bucket];
            table_array[bucket]=newnode;
            count++;
        }
    }
    public Object get(Object key){
        int bucket=hash(key);
        Node list=table_array[bucket];
        while(list!=null){
            if(list.key.equals(key)){
                return list.value;
            }
            list=list.next;
        }
        return null;
    }
    private void resize() {
        Node[] newTable_array = new Node[table_array.length*2];
        for(int i=0;i<table_array.length;i++){
            Node list= table_array[i];
            while(list!=null){
                Node next = list.next;
                int hash=(Math.abs(list.key.hashCode()))%newTable_array.length;
                list.next=newTable_array[hash];
                newTable_array[hash]=list;
                list=next;
            }
        }
        table_array=newTable_array;
    }
    public void display(){
        for(int i=0;i<table_array.length;i++){
            System.out.print((i+1)+ " ");
            Node list= table_array[i];
            while(list!=null){
                System.out.print("( " + list.key + " , " + list.value + " )");
                list=list.next;
            }
            System.out.println();
        }
    }
    public int hash(Object key){
        return (Math.abs(key.hashCode()))%table_array.length;
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
        Node prev = table_array[bucket];
        Node curr = prev.next;
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
        Node list = table_array[bucket];
        while(list!=null){
            if(list.key.equals(key)){
                return true;
            }
            list=list.next;
        } 
        return false;
    }
    public static void main(String[] args) {
        Hashtable2 a = new Hashtable2(5);
        Object[] keys={"A","B","C","D"};
        Object[] values={10,20,30,40};

        for(int i=0;i<keys.length;i++){
            a.put(keys[i], values[i]);
        }
        System.out.println(a.get("C"));
        a.remove("C");
        System.out.println(a.contains("F"));
        // System.out.println(a.get("C"));
        a.display();


    }
}

