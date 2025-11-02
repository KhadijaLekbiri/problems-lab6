package problem5;

public class Main {
    public static void main(String[] args){
        System.out.println("=== Stack Test ===");

        BookStack stack = new BookStack();

        // Push (LIFO)
        stack.push(new Book("The Hobbit", "J.R.R. Tolkien", 1937));
        stack.push(new Book("1984", "George Orwell", 1949));
        stack.push(new Book("Clean Code", "Robert C. Martin", 2008));

        stack.display();

        System.out.println("Popped: " + stack.pop());
        System.out.println("Top: " + stack.peek());
        stack.display();


        // ===== QUEUE TEST =====
        System.out.println("=== Queue Test ===");

        BookQueue queue = new BookQueue();

        // Enqueue (FIFO)
        queue.enqueue(new Book("The Hobbit", "J.R.R. Tolkien", 1937));
        queue.enqueue(new Book("1984", "George Orwell", 1949));
        queue.enqueue(new Book("Clean Code", "Robert C. Martin", 2008));

        queue.display();

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front: " + queue.peek());
        queue.display();
    }
}
