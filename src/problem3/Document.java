package problem3;

public class Document {
    protected int numRec;
    protected static int nextNumRec = 1;
    protected String title;
    protected Library library;

    public Document(String title){
        this.numRec = nextNumRec++;
        this.title = title;
    }

    public int getNumRec() {
        return numRec;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Document #" + numRec + " - Title: " + title;
    }

}
