package ArrayListChallenge;
import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        ArrayList myList = new ArrayList<>();

        do {
            printMenu();
            choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1){
                System.out.println("Enter the items to to add to list (comma delimited list)");
                String elements = sc.nextLine();  //here we take the elements as a string
                List array = Arrays.asList(elements.split(",")); //we separate the items by the regex ",", and return a List using asList
                for (var e: array){
                    if (!myList.contains(e)){
                        myList.add(e);
                    }
                }
            }
            else if (choice == 2){
                System.out.println("Enter the items to to remove to list (comma delimited list)");
                String elements = sc.nextLine();
                myList.removeAll(Arrays.asList(elements.split(",")));
            }
            else if (choice == 3){
                System.out.println(myList);
            }
            else{
                System.out.println("Invalid option!!");
            }
            myList.sort(Comparator.naturalOrder());
            System.out.println(myList);
        } while(choice != 0);
        System.out.println(myList);

    }
    public static void printMenu(){
        System.out.println("""
                Available actions:
                    0 - to shutdown
                    1 - to add item(s) to list (comma delimited list)
                    2 - to remove any items (comma delimited list)
                    3 - to check if an element is in the list
                Enter a number for which action you want to do:""");
    }
}
