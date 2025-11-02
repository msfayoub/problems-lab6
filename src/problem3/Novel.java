package problem3;

public class Novel extends Book{
    private double price;
    public Novel(String title,String author,int nbrPages,int price){
        super(title,author,nbrPages);
        this.price=price;
    }

    public String toString(){
        return "[Novel id: "+this.numRec+" .\nDocument title: "+this.title+".\n"
                +"Author: "+this.author+".\n"+"nbrPages: "+this.nbrPages+".\n"
                +"Price: $"+this.price+"]\n";
    }


}
