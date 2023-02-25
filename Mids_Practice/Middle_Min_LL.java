public class Middle_Min_LL {
        private int get(int i) {
            return i;
        }
        private int size() {
            return  0;
        }
        static class Node {
            int data;
            Node next;
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        Node head;

        // Find the middle element of the LinkedList
        public int findMiddleElement() {
            Node p = head;
            Node q = head;

            while (p != null && q.next != null) {
                p = p.next;
               q= q.next.next;
            }

            return p.data;
        }

        public int findLastElement() {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }

            return current.data;
        }

        public static void main(String[] args) {
            Middle_Min_LL list = new Middle_Min_LL();

            list.head = new Middle_Min_LL.Node(25);
            list.head.next = new Middle_Min_LL.Node(9);
            list.head.next.next = new Middle_Min_LL.Node(11);
            list.head.next.next.next = new Middle_Min_LL.Node(16);
            list.head.next.next.next.next = new Middle_Min_LL.Node(01);
            list.head.next.next.next.next.next = new Middle_Min_LL.Node(15);
            list.head.next.next.next.next.next.next = new Middle_Min_LL.Node(95);

            int middleElement = list.findMiddleElement();
            System.out.println("Middle element: " + middleElement);

            int lastElement = list.findLastElement();
            System.out.println("Last element: " + lastElement);

            int min = list.get(1);
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) < min) {
                    min = list.get(i);
                }
            }
            System.out.println("Minimum value: " + min);
        }
    }

