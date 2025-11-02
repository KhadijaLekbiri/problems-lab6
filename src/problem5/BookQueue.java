package problem5;

import java.util.LinkedList;

public class BookQueue {
    private LinkedList<Book> queue;

    public BookQueue() {
        this.queue = new LinkedList<>();
    }
    public void enqueue(Book book) {
        this.queue.addLast(book);
    }

    public Book dequeue() {
        if (this.isEmpty()){
            return null;
        }
        return this.queue.removeFirst();
    }

    public Book peek() {
        if (this.queue.isEmpty()){
            return null;
        }
        return this.queue.getFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void display() {
        System.out.println("Queue contents (front to back):");
        for (Book book: this.queue){
            System.out.println("- "+book.toString());
        }
    }

}
