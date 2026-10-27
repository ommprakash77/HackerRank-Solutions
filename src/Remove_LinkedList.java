public class Remove_LinkedList {

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node LastNode = head;
        while (LastNode.next != null) {
            LastNode = LastNode.next;
        }
        LastNode.next = newNode;

    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node LastNode = head;
        while (LastNode != null) {
            System.out.print(LastNode.data + "->");
            LastNode = LastNode.next;
        }
        System.out.println("null");

    }

    public void RemoveFirst() {
        if (head == null) {
            System.out.println("Empty list is delete");
            return;
        }
        head = head.next;
    }

    public void RemoveLast() {
        if (head == null) {
            System.out.println("Empty list is delete");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondlast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            secondlast = secondlast.next;
            lastNode = lastNode.next;
        }
        secondlast.next = null;
    }

    public void Reverseiterative() {
        if (head == null || head.next == null) {
            return;
        }
        Node preveNode = head;
        Node currNode = head.next;

        while (currNode.next != null) {
            Node nextNode = currNode.next;
            currNode.next = preveNode;

            //update
            preveNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = preveNode;
    }



    public static void main(String[]args){
        Remove_LinkedList list=new Remove_LinkedList();
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("LinkedList");
        list.addLast("to");

        list.printList();

        list.Reverseiterative();
        list.printList();


    }
}
