public class Testdb {
 
    public static void main(String[] args) {

        Table tab = new Table("Table1", 4, 4);
        System.out.println(tab);
     
        String[] array = {"a","b","c","d"}; 
        String[] array2 = {"e","f","g","h"}; 
        tab.insert(array);
        tab.insert(array2);
        tab.printTable();
        tab.clearTable();
        System.out.println();
        tab.insert(array);
        tab.printTable();

    }

}