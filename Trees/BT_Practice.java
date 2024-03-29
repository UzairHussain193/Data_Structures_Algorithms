public class BT_Practice {
    Object root;
    BT_Practice right, left;

    public BT_Practice(Object root) {
        this.root = root;
    }

    public BT_Practice(Object root, BT_Practice left, BT_Practice right) {
        this.root = root;
        this.right = right;
        this.left = left;
    }

    public Object getroot() {
        return root;
    }

    public BT_Practice getright() {
        return right;
    }

    public BT_Practice getlrft() {
        return left;
    }

    public boolean isLeaf() {
        if (this.left == null && this.right == null) {
            return true;
        }
        return false;
    }

    public String Inorder() {
        StringBuffer buf = new StringBuffer();
        if (this.left != null) {
            buf.append(left.Inorder() + " ");
        }
        buf.append(this.root );
        if (this.right != null) {
            buf.append(right.Inorder() + " ");
        }
        return buf + "";
    }

    public String Preorder() {
        StringBuffer buf = new StringBuffer();
        buf.append(this.root);
        if (this.left != null) {
            buf.append(left.Preorder() + " ");
        }
        if (this.right != null) {
            buf.append(right.Preorder() + " ");
        }
        return buf + "";
    }

    public String Postorder() {
        StringBuffer buf = new StringBuffer();
        if (this.left != null) {
            buf.append(left.Postorder() + " ");
        }
        if (this.right != null) {
            buf.append(right.Postorder() + " ");
        }
        buf.append(this.root);
        return buf + "";
    }

    public int size() {
        if (left == null && right == null) {
            return 1;
        }
        if (left == null) {
            return 1 + left.size();
        }
        if (right == null) {
            return 1 + right.size();
        }
        return 1 + right.size() + left.size();
    }

    public int height() {
        if (root == null) {
            return -1;
        }
        int lc = 0, rc = 0;
        if (left != null) {
            lc = 1 + left.height();
        }
        if (right != null) {
            rc = 1 + right.height();
        }
        int max;
        if (lc > rc) {
            max = lc;
        } else {
            max = rc;
        }
        return max;
    }
    public int size(BT_Practice node) {
        if (node == null)
            return 0;
        else
            return (size(node.left) + 1 + size(node.right));
    }

    public int height(BT_Practice root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public boolean isFull2(BT_Practice root) {
        double size = Math.pow(2, root.height() + 1);
        if (size - 1 == root.size()) {
            return true;
        }
        return false;
    }
    public boolean isFull(BT_Practice root) {
        if(root==null){
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        if (root.left != null && root.right != null) {
            return isFull(root.left) && isFull(root.right);
        }
        return false;
    }

    public boolean search(Object value) {
        boolean inLeft = false, inRight = false;
        if (root == null) {
            return false;
        }
        if (root.equals(value)) {
            return true;
        }
        if (left != null) {
            inLeft = left.search(value);
        }
        if (right != null) {
            inRight = right.search(value);
        }
        if (inLeft || inRight) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        BT_Practice b1 = new BT_Practice(4);
        BT_Practice b2 = new BT_Practice(5);
        BT_Practice b3 = new BT_Practice(2, b1, b2);
        BT_Practice b4 = new BT_Practice(6);
        BT_Practice b5 = new BT_Practice(7);
        BT_Practice b6 = new BT_Practice(3,b4,b5);
        BT_Practice b7 = new BT_Practice(1, b3, b6);
        // BT_Practice b1 = new BT_Practice("D");
        // BT_Practice b2 = new BT_Practice("E");
        // BT_Practice b3 = new BT_Practice("B", b1, b2);
        // BT_Practice b4 = new BT_Practice("F");
        // BT_Practice b5 = new BT_Practice("C", null, b4);
        // BT_Practice b6 = new BT_Practice("A", b3, b5);

        System.out.println("Size: " + b7.size(b7));
        System.out.println("Height: " + b7.height(b7));
        System.out.println("Is Full: " + b7.isFull(b7));
        System.out.println("Search (9) : " + b7.search(9));
        System.out.println("Post Order: " + b7.Postorder());
        System.out.println("Pre Order: " + b7.Preorder());
        System.out.println("In Order: " + b7.Inorder());
        
    }
}
