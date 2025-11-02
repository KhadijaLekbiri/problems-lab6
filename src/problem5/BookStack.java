package problem5;

import java.util.LinkedList;

public class BookStack {
    private LinkedList<Book> stack;

    public BookStack() {
        this.stack = new LinkedList<>();
    }

    public void push(Book book) {
        this.stack.addFirst(book);
    }

    public Book pop() {
        if (this.isEmpty()){
            return null;
        }
        return this.stack.removeFirst();
    }

    public Book peek() {
        if (this.stack.isEmpty()){
            return null;
        }
        return this.stack.getFirst();    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void display() {
        System.out.println("Stack contents (top to bottom):");
        for (Book book: this.stack){
            System.out.println("- "+book.toString());
        }
    }
}
