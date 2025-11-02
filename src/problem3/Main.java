package problem3;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Enter the number of documents in the library:");
        int n = scanner.nextInt();
        scanner.nextLine();
        Library library = new Library(n);
        Book book1 = new Book("Beauty Sick","Renee Engeln",300);
        Book book2 = new Book("Harry Potter","J. K. Rowling",2000);
        library.add(book1);
        library.add(book2);

        printMenu();
        int choice = scanner.nextInt();
        scanner.nextLine();
        while (choice != 0){
            switch (choice){
                case 1:
                    if (library.getCapacity() < library.getDocumentsSize()){
                        System.out.println("Library is full!");
                        break;
                    }
                    System.out.println("""
                    Which document you want to add:
                        1- Novel.
                        2- TextBook.
                        3- Magazine.
                        4- Dictionary.""");
                    int type = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the title:");
                    String title = scanner.nextLine();
                    switch (type){
                        case 1:
                            System.out.println("Enter the author:");
                            String author = scanner.nextLine();
                            System.out.println("Enter the nbrPages:");
                            int nbrPages = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Enter the price:");
                            double price = scanner.nextDouble();
                            scanner.nextLine();
                            Novel novel = new Novel(title,author,nbrPages,price);
                            library.add(novel);
                            break;
                        case 2:
                            System.out.println("Enter the author:");
                            String author2 = scanner.nextLine();
                            System.out.println("Enter the nbrPages:");
                            int nbrPages2 = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Enter the level:");
                            String level = scanner.nextLine();
                            scanner.nextLine();
                            Textbook textbook = new Textbook(title,author2,nbrPages2,level);
                            library.add(textbook);
                            break;
                        case 3:
                            System.out.println("Enter the month:");
                            String month = scanner.nextLine();
                            System.out.println("Enter the year:");
                            int year = scanner.nextInt();
                            scanner.nextLine();
                            Magazine magazine = new Magazine(title,month,year);
                            library.add(magazine);
                            break;
                        case 4:
                            System.out.println("Enter the language:");
                            String language = scanner.nextLine();
                            Dictionary dictionary = new Dictionary(title,language);
                            library.add(dictionary);
                            break;
                        default:
                            System.out.println("Invalid document.");
                            break;
                    }
                    break;
                case 2:
                    library.displayDocuments();
                    break;
                case 3:
                    System.out.println("Enter the number of record of the document to delete:");
                    int num = scanner.nextInt();
                    scanner.nextLine();
                    library.delete(library.document(num));
                    break;
                case 4:
                    library.displayAuthors();
                    break;
                default:
                    break;
            }
            printMenu();
            choice = scanner.nextInt();
        }
    }


    public static void printMenu()
    {
        System.out.println("\n Menu ");
        System.out.println(" ====");
        System.out.println("""
                0: Quit.
                1- Add a document in the library.
                2- Display info of the library.
                3- Delete the document.
                4- Display Authors""");
        System.out.print("\nEnter your choice: ");
    }
}
