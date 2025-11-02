package problem2;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions =  new ArrayList<>();

    public Customer(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public ArrayList<Double> getTransactions(){
        return this.transactions;
    }

    public void addTransaction(double amount){
        this.transactions.add(amount);
    }



}
