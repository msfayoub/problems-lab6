package problem3;

public class Document {
    protected int numRec;
    protected String title;
    static int numEnerg=1;
    public Document(String title){
        this.numRec=numEnerg;
        this.title=title;
        numEnerg++;
    }
    public String toString(){
        return "[Document id: "+numRec+" .\nDocument title: "+title+"]\n";
    }

    public int getRef(){
        return numRec;
    }
}
