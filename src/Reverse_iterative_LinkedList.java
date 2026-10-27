public class Reverse_iterative_LinkedList {
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
        newNode = head;
        head = newNode.next;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node lastNode = head;
        while (lastNode != null) {
            System.out.print(lastNode.data + "->");
            lastNode=lastNode.next;
        }
        System.out.println("null");
    }

        public void reverseiterative() {
            if (head == null || head.next == null) {
                return;
            }

            Node preveNode = head;
            Node currNode = head.next;

            while (currNode != null) {
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
                Reverse_iterative_LinkedList list=new Reverse_iterative_LinkedList();
                list.addFirst("1");
                list.addLast("2");
                list.addLast("3");
                list.addLast("4");
                list.printList();

                list.reverseiterative();
                list.printList();
            }
        }

