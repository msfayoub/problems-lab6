package problem3;


import java.net.Authenticator;

public class Book extends Document {
    protected String author;
    protected int nbrPages;
    public Book(String title,String author,int nbrPages){
        super(title);
        this.author=author;
        this.nbrPages=nbrPages;
    }

    public String toString(){
        return "[Book id: "+this.numRec+" .\nDocument title: "+this.title+".\n"
                +"Author: "+this.author+".\n"+"nbrPages: "+this.nbrPages+"]\n";
    }

    public String getAuthor(){
        return author;
    }

}
