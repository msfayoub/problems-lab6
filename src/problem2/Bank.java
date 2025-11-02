package problem2;

import java.util.ArrayList;

public class Bank {
    private String name;
    ArrayList<Customer> customers;
    public Bank(String name){
        this.name=name;
        customers=new ArrayList<Customer>();
    }


    public void addCustomer(Customer cust){
        for (Customer c:customers){
            if (c.getName().equals(cust.getName())){
                return;
            }
        }
        customers.add(cust);
    }
    public void addTransaction(Customer c1,Customer c2,Double amount){
        c1.addTransaction(-amount);
        c2.addTransaction(amount);
    }

    public void printStatements(){
        System.out.println("Bank Sttements :");
        for (Customer c:customers){
            System.out.println("Name: "+c.getName());
            c.printTransactions();
        }
    }
}
