public class Testdb {
 
    public static void main(String[] args) {

        Table tab = new Table("Table1", 4, 4);
        System.out.println(tab);

        String[] array1 = {"a","b","c","d"};
        String[] array2 = {"e","f","g","h"};
        String[] array3 = {"i","j","k","l"};
        String[] array4 = {"m","n","o","p"};

        tab.insert(array1);
        tab.insert(array2);
        tab.insert(array3);
        tab.insert(array4);
        tab.printTable();
        tab.clearTable();
        System.out.println();
        tab.insert(array1);
        tab.insert(array2);
//         tab.getRow(3);
        tab.printTable();

    }
}
