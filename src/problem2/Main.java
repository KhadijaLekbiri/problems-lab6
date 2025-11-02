package problem2;

public class Main {
    public static void main(String[] args){
        Bank bank1 =  new Bank("BMCE");

        Customer customer1 = new Customer("Rhita");
        Customer customer2 = new Customer("Assia");

        bank1.addNewCustomer(customer1);
        bank1.addNewCustomer(customer2);

        customer1.addTransaction(1000);
        customer1.addTransaction(-300);
        customer2.addTransaction(22000);
        customer2.addTransaction(-20000);


        System.out.println("Bank's info:");
        bank1.printInfo();

        bank1.addTransaction(500,"Assia","Rhita");

        System.out.println("Bank's info:");
        bank1.printInfo();

    }

}
