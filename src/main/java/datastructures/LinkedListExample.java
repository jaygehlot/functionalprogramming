package datastructures;

public class LinkedListExample {

    /**
     * Advantages of LinkedList
     * not fixed sized, can grow an shift at runtime
     * more memory required,
     * search or node traversal more difficult as pointers to the next object
     * @param args
     */
    public static void main(String[] args) {

        printOutLinkedListWithMiddleDeleted();

    }

    private static void printOutLinkedListWithMiddleDeleted() {
        Node<Integer> head = buildNode(8);
        Node<Integer> nodeA = buildNode(3);
        Node<Integer> nodeB = buildNode(18);
        Node<Integer> nodeC = buildNode(12);
        Node<Integer> nodeD = buildNode(1);

        head.setNext(nodeA);
        nodeA.setNext(nodeB);
        nodeB.setNext(nodeC);
        nodeC.setNext(nodeD);

        printLinkedList(head);
    }

    private static void printLinkedList(Node head) {
        while (head != null) {
            System.out.println(head.getData() + ", ");
            head = head.getNext();
        }
        System.out.println("END");
    }

    private static Node<Integer> buildNode(int data) {
        Node node = new Node();
        node.setData(data);
        node.setNext(null);
        return node;
    }
}
