package problem5;


import java.util.LinkedList;
import java.util.Queue;

public class BookQueue {
    private LinkedList<Book> queue;

    public BookQueue() {
        queue=new LinkedList<>();
    }

    public void enqueue(Book book) {
        queue.addLast(book);
    }

    public Book dequeue() {
        // code here and don't to test if it's empty
        if (queue.isEmpty()){
            return null;
        }
        return queue.removeFirst();
    }

    public Book peek() {
        // code here and don't to test if it's empty
        if (queue.isEmpty()){
            return null;
        }
        return queue.getFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void display() {
        System.out.println("Queue contents (bottom to top):");
        for (Book b : queue) {
            System.out.println(" - "+b);
        }


    }
}

