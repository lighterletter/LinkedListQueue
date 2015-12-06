package c4q.lighterletter;

/**
 * Created by c4q-john on 12/5/15.
 */
public class Queue {
    Node tail;
    Node head;

    public boolean isEmpty() {
        return head == null;
    }


    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            newNode.next = head;
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = null;
        }
    }

    public void dequeue() {
        if (head.next == null) {
            tail = null;
        }
        head = head.next;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            temp.displayData();
            temp = temp.next;
        }
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    public void displayData(){
        System.out.println(data);
    }
}


