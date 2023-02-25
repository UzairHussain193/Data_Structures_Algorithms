public class BinaryTree {
    Object root;
    BinaryTree left,right;
    public BinaryTree(Object root){
        this.root=root;
    }
    public BinaryTree(Object root, BinaryTree left, BinaryTree right){
        this.root=root;
        this.left=left;
        this.right=right;
    }
    public Object getroot(){
        return root;
    }
    public BinaryTree getleft(){
        return left;
    }
    public BinaryTree getright(){
        return right;
    }
    public boolean isLeaf(){
        if(this.left==null && this.right==null){
            return true;
        }
        return false;
    }
    public String toString(){
        /// For In Order Print Condition: L Root R
        StringBuffer buf = new StringBuffer();
        if(this.left!=null){
            buf.append(left);
        }
        buf.append(root+",");
        if(this.right!=null){
            buf.append(right);
        }
        return buf+"";
    }
    public String PreOrder(){
        /// For Pre Order Print Condition: Root L R
        StringBuffer bu = new StringBuffer();

        bu.append(root+",");
        if(this.left!=null){
            bu.append(left.PreOrder());
        }
        if(this.right!=null){
            bu.append(right.PreOrder());
        }
        return bu+"";
    }
    public String PostOrder(){
        /// For Post Order Print Condition: L R Root
        StringBuffer buff = new StringBuffer();
        if(this.left!=null){
            buff.append(left.PostOrder()+",");
        }
        if(this.right!=null){
            buff.append(right.PostOrder()+",");
        }
        buff.append(root);
        return buff+"";
    }
    //checks if binary tree is full 
    // public boolean isFull(BinaryTree root){
    //     if(root==null){
    //         return true;
    //     }
    //     if(this.left==null && this.right==null){
    //         return true;
    //     }
    //     if(this.left!=null && this.right!=null){
    //         return isFull(root.left) && isFull(root.right);
    //     }
    //     return false;
    // } 
     // computes number of nodes in tree 
     public static int size(BinaryTree root){
        if (root == null){
            return 0;
        }
        int leftNodes=size(root.left);
        int rightNodes=size(root.right);
      
        return (leftNodes + 1 + rightNodes);    // adding +1 of root
    }
    public boolean isFull(BinaryTree root){
        int nodes=1;
        int power=height(root)+1;
        Math.pow(nodes, power);
        nodes--;
        if(size(root)==nodes){
            return true;
        }
        else{
            return false;
        }
    }
   

    public int height(BinaryTree root){
        if(root==null){
            return 0;
        }
        int leftsize=0;
        int rightsize=0;
        BinaryTree temp=root;

        while(root.left!=null){
            leftsize++;
            root=root.left;
        }while(temp.right!=null){
            rightsize++;
            temp=temp.right;
        }
        return Math.max(leftsize,rightsize);
                /// Another method
        // return Math.max(height(root.left),height(root.right))+1;
    }
    
    void search(Object x){
        if(root.equals(x)){
            System.out.println(x + " Found");
        }
        else if(left!=null){
            left.search(x);
        }
        else if(right!=null){
            right.search(x);
        }
        else{
            System.out.println("Not Found:");
        }
    }
    
 
    public static void main(String[] args) {
        BinaryTree b1 = new BinaryTree("D");
        BinaryTree b2 = new BinaryTree("E");
        BinaryTree b3 = new BinaryTree("B",b1,b2);
        BinaryTree b4 = new BinaryTree("F");
        BinaryTree b5 = new BinaryTree("C",null,b4);
        BinaryTree b6 = new BinaryTree("A",b3,b5);

        // System.out.println(b3.getroot());
        // System.out.println(b3.getleft());
        // System.out.println(b3.getright());

        BinaryTree b = new BinaryTree("C");
        System.out.println("Pre Order: "+b6.PreOrder());
        System.out.println("Post Order: "+b6.PostOrder());
        System.out.println("In Order: "+b6.toString());
        System.out.println("Size: "+b6.size(b6));
        System.out.println("If Full: "+b6.isFull(b6));
        System.out.println("Height: "+b6.height(b6));
        b6.search("L");
    }   
}
