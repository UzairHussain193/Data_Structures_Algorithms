package Graphs;

public class Graph {
    int size;
    String[] vertices;
    boolean[][] a;

    public Graph(String[] args){
        size=args.length;
        vertices= new String[size];
        System.arraycopy(args, 0, vertices, 0, size);

        a = new boolean[size][size];
    }
    public void add(String v, String w){
        int i= index(v), j= index(w);
        a[i][j]=a[j][i]=true;
    }
    private int index(String v) {
        for(int i=0;i<size;i++){
            if(vertices[i].equals(v)){
                return i;
            }
        }
        return size;
    }
    public String toString(){
        if(size==0){
            return "{}";
        }
        StringBuffer buf = new StringBuffer("{" + vertices[0]);
        for(int i=0;i<size;i++){
            buf.append(":"+vertices[i]);
        }
        return buf+"}";
    }
    private String vertex(int i){
        StringBuffer b = new StringBuffer(vertex(i)+":");
        for(int j=0;j<size;j++){
            if(a[i][j]){
                b.append(vertices[i]);
            }
        }
        return b+"";
    }
    public static void main(String[] args) {
        String[] elements= {"A","B","C","D"};
        Graph myGraph = new Graph(elements);
        myGraph.add("A", "B");
        myGraph.add("A", "D");
        myGraph.add("B", "C");
        myGraph.add("B", "D");
        myGraph.add("C", "D");
        System.out.println(myGraph.toString());

    }
}
