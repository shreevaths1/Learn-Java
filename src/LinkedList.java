class LinkedList {
    Node head;
    private int size;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void addLast(String data) {
        Node newNode = new Node(data);
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        head = head.next;
    }

    void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        // head.next==null
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLastNode = head;
        Node lastNode = head.next; // head.next==null
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }

        secondLastNode.next = null;
    }

    void printList() {
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        if (currNode == null) {
            System.out.println("NULL");
            return;
        }
    }

    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("This");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();
    }
}