package problem2;

import java.util.ArrayList;

public class Customer {
    private String name;
    ArrayList<Double> transactions;

    public Customer(String name){
        this.name=name;
        transactions=new ArrayList<Double>();
    }
    public String getName(){
        return name;
    }

    public void addTransaction(Double Amount){
        transactions.add(Amount);
    }
    public void printTransactions(){
        int count=1;
        for (Double t:transactions){
            System.out.println("Transactions number "+count+" ,with amount : $"+t);
            count++;
        }
        if (count==1){
            System.out.println("No transactions yet.");
        }
    }
}
