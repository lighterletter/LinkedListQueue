package c4q.lighterletter;

public class Main {

    public static void main(String[] args) {


        //This works
        Queue line = new Queue();
        line.enqueue(5);
        line.enqueue(6);
        line.enqueue(6);
        line.enqueue(4);
        line.enqueue(3);
        line.enqueue(7);
        line.enqueue(2);
        line.printList();
        line.dequeue();
        System.out.println();
        line.printList();

        line.dequeue();
        line.dequeue();

        System.out.println();
        line.printList();


        HashQueue hqueue = new HashQueue();

        //test cases

//        hqueue.enqueue(5);
//        hqueue.enqueue(3);
//        hqueue.enqueue(4);
//        hqueue.enqueue(1);
//        hqueue.enqueue(2);
//
//        hqueue.printQueue();
//
//        System.out.println();
//
//        hqueue.dequeue();
//        hqueue.dequeue();
//        System.out.println();
//
//        hqueue.printQueue();






    }
}
