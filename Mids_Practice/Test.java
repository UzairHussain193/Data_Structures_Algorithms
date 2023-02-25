
    class Node14 {
        int data;
        Node14 next;

        public Node14(int data) {
            this.data = data;
        }
        public Node14(int data,Node14 next) {
            this.data = data;
            this.next=next;
        }

    }


    public class Test {

        public static void main(String[] args) {

            Node14 head = new Node14(15);
            Node14 current = head;
            current.next = new Node14(16);
            current = current.next;
            current.next = new Node14(17);
            current = current.next;

            for (int i = 0; i < 3; i++) {
                current.next = new Node14(head.data);
                current = current.next;
                current.next = new Node14(head.next.data);
                current = current.next;
                current.next = new Node14(head.next.next.data);
                current = current.next;

            }

            current = head;
            for (int i = 0; i < 9; i++) {
                System.out.print(current.data+"  ");
                current = current.next;
            }
        }
    }
