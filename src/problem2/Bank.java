package problem2;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String name){
        this.name= name;
    }
    public String getName(){
        return this.name;
    }
    public ArrayList<Customer> getCustomers (){
        return this.customers;
    }

    public void addNewCustomer(Customer customer){
        this.customers.add(customer);
    }

    public void addTransaction(double amount,String name_operator, String name_customer){
        int track = 0;
        for (Customer customer: this.getCustomers()){
            if (customer.getName().equals(name_operator)){
                customer.addTransaction(-amount);
                track++;
            }
            else if (customer.getName().equals(name_customer)){
                customer.addTransaction(amount);
                track++;
            }
            if (track == 2){
                break;
            }
        }
    }

    public void printInfo(){
        for (Customer customer: customers){
            double balance = 0;
            System.out.println("=========\nCustomer's name: "+customer.getName()+"\nTransactions:");
            for (Double trans: customer.getTransactions()){
                System.out.println("\t"+(double)trans+"DHs");
                balance+=trans;
            }
            System.out.println("Balance:  "+balance+"DHs");
        }
    }
}
