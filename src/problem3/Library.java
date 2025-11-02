package problem3;

import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Document> documents;

    public int getCapacity() {
        return capacity;
    }

    public int getDocumentsSize() {
        return documents.size();
    }

    public Library(int capacity){
        this.capacity = capacity;
        this.documents = new ArrayList<>(capacity);
    }

    public void displayDocuments(){
        if (documents.isEmpty()){
            System.out.println("No Documents in the library: ");
            return;
        }
        System.out.println("Documents in the library: ");
        for (Document doc: documents){
            System.out.println(doc.toString());
        }
    }

    public boolean add(Document doc){
        if (this.capacity < this.documents.size()){
            System.out.println("Library is full!");
            return false;
        }
        this.documents.add(doc);
        return true;
    }

    public boolean delete(Document doc){
        if (documents.isEmpty()){
            System.out.println("Library is empty!");
            return false;
        }
        if (doc != null){
            this.documents.remove(doc);
            return true;
        }
        System.out.println("The record number is invalid!");
        return false;
    }

    public Document document(int numEnrg){
        for (Document doc: documents){
            if (doc.numRec == numEnrg){
                return doc;
            }
        }
        return null;
    }

    public void displayAuthors(){
        for (Document doc: documents){
            if (Book.class.isInstance(doc)){
                System.out.println(((Book)doc).getAuthor());
            }
        }
    }

}
