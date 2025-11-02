package problem3;

import javax.print.Doc;
import java.util.ArrayList;

public class Library {
    private int capacity;
    ArrayList<Document> documents;
    private int numItems=0;

    public Library(int capacity){
        this.capacity=capacity;
        documents=new ArrayList<Document>(this.capacity);
    }

    public void displayDocuments(){
        System.out.println("Documents in the library: ");
        for (Document d:documents){
            System.out.println(d);
        }
        if (numItems==0){
            System.out.println("No documents yet.");
        }
    }

    public Boolean add(Document doc){
        if (numItems==capacity){
            return false;
        }
        documents.add(doc);
        numItems++;
        return true;
    }
    public Boolean delete(Document doc){
        if (documents.remove(doc)) {
            numItems--;
            System.out.println("Document removed successfully.");
            return true;
        } else {
            System.out.println("Document not found in library.");
            return false;
        }
    }

    public Document document(int numEnrg){
        for (Document d:documents){
            if (d.getRef()==numEnrg){
                return d;
            }
        }
        return null;
    }

    public void displayAuthors(){
        System.out.println("Authors: " );
        int count=1;
        for (Document d:documents){
            if (d instanceof Book) {
                Book b = (Book) d;
                System.out.println("Author # "+count+": " + b.getAuthor());
                count++;
            }
        }
    }
}
