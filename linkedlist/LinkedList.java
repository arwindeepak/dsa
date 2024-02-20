import org.w3c.dom.Node;

/**
 * LinkedList
 */
public class LinkedList {
    Node head;
    /**
     * Node
     */
    public class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        };
        //implementation of insertion of a node at the end
        public  void insertAtEnd(int newData) {
            Node newNode = new Node(newData);

            //linkedlist is empty
            if (head == null) {
                head = new Node(newData);
                return;
            }
            //linkedlist is not empty 
            newNode.next = null;
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            //implemention of displaying

        }

        public void displayLL() {
            Node current = head;
            while (current!=null) {
                System.out.println(current.data + " ");
                current = current.next;
            }
        }
        
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtEnd(2);
        
    }
}