public class Insert_Delete_Linkedlist {

    static class Node {
        Node next;
        int data;

        public Node() {

        }

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    } // end of class Node

    public static void displayList(Node start) {
        Node p;
        for (p = start; p != null; p = p.next) {
            System.out.print(p.data + "  ");
        }
        System.out.println();
    } // end of displayList() method

    // Insertion in between first and last node (Prerequisite: Sorted List)
    // public static void insert(Node start, int x){
    // Node p = start;
    // while (p.next!=null){
    // if (p.next.data>x){
    // break;
    // }
    // p = p.next; // Update Condition of while loop
    // } // end of while loop
    // Node q = new Node(x);
    // q.next = p.next;
    // p.next = q;
    // } // end of insert

    // Insertion before first (if target<first || list is null) (Prerequisite:
    // Sorted List)
    public static Node insert(Node head, int x) {
        Node p = head;
        if (head == null || head.data > x) {
            head = new Node(x);
            head.next = p;
        }
        return head;
    }

    // Delete Node from LL
    public static Node delete(Node start, int x) {
        if (start.data > x || start == null) {
            return start;
        }
        if (start.data == x) {
            start = start.next;
            return start;
        }
        for (Node p = start; p.next != null; p = p.next) {
            if (p.next.data > x) {
                break;
            }
            if (p.next.data == x) {
                p.next = p.next.next;
                break;
            }
        } // end of for loop
        return start;
    }

    public static void main(String[] args) {

        Node head = new Node(4);
        Node p = head;
        p.next = new Node(6);
        p = p.next;
        p.next = new Node(8);
        p = p.next;
        p.next = new Node(10);
        p = p.next;

        displayList(head);
        Node a = insert(head, 2);
        //insert(start, 7);
        // insert(start, 5);
        // insert(start, 6);
        displayList(a);
        // displayList(start);

        delete(head, 6);
        delete(head, 8);
        displayList(a);
    } // end of main() method
} // end of program

// class node {
// int data;
// node next;

// node(int d1) {
// data = d1;
// }

// node(int d2, node next) {
// data = d2;
// this.next = next;
// }

// void insert1(node start, int n) {
// node p = start;
// while (p.next != null) {
// if (p.next.data > n) {
// break;
// }
// p = p.next;
// }
// p.next = new node(x, p.next);
// }

// Node insert2(node start, int n) {
// if (start == null || start.data > x) {

// }
// }

// }

// public class list2 {
// public static void main(String[] args) {
// node n = new node(8);
// n.insert1(n, 8);
// }

// }
