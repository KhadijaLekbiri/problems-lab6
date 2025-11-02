package problem4;

import java.util.*;

public class ListPerformanceComparison {

    private static final int SIZE = 100_000;        // total elements
    private static final int OPERATIONS = 10_000;   // random operations to test

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();


        System.out.println("---- Performance Comparison ----");

        System.out.println("---- Populate both lists ----");
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // 2️⃣ Random insertions and deletions
        testRandomInsertDelete(arrayList, "ArrayList");
        //Since the arrayList is an indexed structure, so when we insert or delete an element using an index,the element is directly accessed or inserted.
        testRandomInsertDelete(linkedList, "LinkedList");
        //Since each element of the linkedList is linked to its next and previous element so deleting or inserting needs to break this link and then retrieve the chain in a correct way that ensure no element is lost
        //so based on the structure and the behavior of each list, linkedList need more time than arraylist to nsert or delete an element in a random index

        // 3️⃣ Sequential insertions/deletions at beginning and end
        testSequentialInsertDelete(arrayList, "ArrayList");
        testSequentialInsertDelete(linkedList, "LinkedList");
        //here since in the linkedList are not indexed so it is easy and fast to delete or add element at the end or the beginning,
        // while in an arraylist the reassignment of the indexes needs to be done which takes more time

        // 4️⃣ Random access test
        testRandomAccess(arrayList, "ArrayList");
        testRandomAccess(linkedList, "LinkedList");
        //thanks to the indexing of the arraylist, it is fast to access an element using index,
        // while in a linkedList each time we want to access an element using an index we need to start from the beginning until we reach the wanted position
    }

    // ------------------------------------------------------------

    private static void testRandomInsertDelete(List<Integer> list, String name) {
        Random random = new Random();
        long start = System.nanoTime();

        int index = random.nextInt(list.size());
        list.remove(index);
        index = random.nextInt(list.size());
        list.add(index,2006);

        long end = System.nanoTime();
        System.out.printf("%s - Random insert/delete: %.3f ms%n",
                name, (end - start) / 1_000_000.0);
    }

    // ------------------------------------------------------------

    private static void testSequentialInsertDelete(List<Integer> list, String name) {
        long start = System.nanoTime();

        if (name.equals("ArrayList")){
            // Insertions at beginning and end
            list.add(0,2006);
            list.add(2000);
            // Deletions at beginning and end
            list.remove(0);
            list.remove(list.size()-1);
        }
        else {
            // Insertions at beginning and end
            ((LinkedList<Integer>) list).addFirst(2006);
            ((LinkedList<Integer>) list).addLast(2000);
            // Deletions at beginning and end
            ((LinkedList<Integer>) list).removeFirst();
            ((LinkedList<Integer>) list).removeLast();
        }

        long end = System.nanoTime();
        System.out.printf("%s - Sequential insert/delete (start/end): %.3f ms%n",
                name, (end - start) / 1_000_000.0);
    }

    // ------------------------------------------------------------

    private static void testRandomAccess(List<Integer> list, String name) {
        Random random = new Random();
        long start = System.nanoTime();

        long sum = 0;
        // sum of the all elements in the list
        for (int i=0; i < list.size();i++){
            sum += list.get(i);
        }
        long end = System.nanoTime();
        System.out.printf("%s - Random access (get): %.3f ms%n",
                name, (end - start) / 1_000_000.0);
    }
}

