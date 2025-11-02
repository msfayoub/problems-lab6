package problem3;

public class Magazine extends Document{
    protected String month;
    protected int year;
    public Magazine(String title,String month,int year){
        super(title);
        this.month=month;
        this.year=year;
    }


    public String toString(){
        return "[Magazine id: "+this.numRec+" .\nMagazine title: "+this.title+".\n"
                +"Month: "+this.month+".\n"+"year: "+this.year+"]\n";
    }
}
