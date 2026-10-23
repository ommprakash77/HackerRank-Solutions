import com.sun.security.jgss.GSSUtil;

public class LL {
    Node head;

    public class Node {
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

    public void addlast(String data) {
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
        Node currNode = head;
        if(head==null){

        System.out.println("List is empty");
        return;
    }
        while(currNode!=null){

        System.out.print(currNode.data + "->");
        currNode = currNode.next;
    }
        System.out.println("null");
}
    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("this");
        list.addFirst("is");
        list.addlast("boy");

        list.printList();

    }
}
