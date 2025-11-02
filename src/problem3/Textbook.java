package problem3;

public class Textbook extends Book{
    private String level;
    public Textbook(String title,String author,int nbrPages,String level){
        super(title,author,nbrPages);
        this.level=level;
    }

    public String toString(){
        return "[Novel id: "+this.numRec+" .\nDocument title: "+this.title+".\n"
                +"Author: "+this.author+".\n"+"nbrPages: "+this.nbrPages+".\n"
                +"Level: $"+this.level+"]\n";
    }
}
