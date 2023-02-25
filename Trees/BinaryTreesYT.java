import java.util.*;

public class BinaryTreesYT {
    static class Node {
        int data;
        Node left;
        Node right;
 
 
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
 
 
    static class BinaryTree {
        static int idx = -1;        //use to increment to length
        public static Node buildTree(int nodes[]) {
            idx++;      //root
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]); 
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
    public static void preorder(Node root) {
        if(root == null) {
            // System.out.print(-1+" ");  //-1 represnts null values
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root) {
        if(root == null) {
            // System.out.print(-1+" ");  //-1 represnts null values
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root) {
        if(root == null) {
            // System.out.print(-1+" ");  //-1 represnts null values
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
 
    public static void levelOrder(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()) {
            Node curr = q.remove();
            if(curr == null) {
                System.out.println();
                //queue empty
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(curr.data+" ");
                if(curr.left != null) {
                    q.add(curr.left);
                }
                if(curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }
 
    public static int countOfNodes(Node root) {
        if(root == null) {
            return 0;
        } 
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);
        return leftNodes + rightNodes + 1;
    }
 
 
 
 
    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
       
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);
        System.out.print("Pre Order Traversal: ");
        preorder(root);
        System.out.print("\nIn Order Traversal: ");
        inorder(root);
        System.out.print("\nPost Order Traversal: ");
        postorder(root);
        System.out.println("\nLevel Order Traversal: ");
        levelOrder(root);
    }
 }
 
 
 