package problem2;

public class Main {
    public static void main(String[] args){
        Customer c1=new Customer("Ayoub");
        Customer c2=new Customer("Reda");
        Customer c3=new Customer("Yahya");
        Customer c4=new Customer("Walid");
        c1.addTransaction(100.0);

        Bank bank=new Bank("BMCE");
        bank.addCustomer(c1);
        bank.addCustomer(c2);
        bank.addCustomer(c3);
        bank.addCustomer(c4);
        bank.printStatements();

        bank.addTransaction(c1,c2,1000.0);
        bank.printStatements();

    }
}
