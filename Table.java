/* 
 * 
 * commands for ArrayList:
 * .get(index);
 * .set(index, input);
 * .remove(index);
 * .clear();
 * .size();
 * 
 * 
 */

import java.util.ArrayList;

public class Table {
    
    private String nameOfTable = "";
    private int rows = 0;
    private int columns = 0;
    private ArrayList<String> list;
    private ArrayList[] listArray;

    
    public Table(String nameOfTable, int rows, int columns){

        this.nameOfTable = nameOfTable;
        this.rows = rows;
        this.columns = columns;
        buildTable();
    }


    private void buildTable(){

        listArray = new ArrayList[columns];

        for(int i = 0; i < columns; i++){
            list = new ArrayList<String>();
            listArray[i] = list;
        }
    }


    public String getNameOfTable(){
        return nameOfTable;
    }


    public int getNumberOfRows(){
        return rows;
    }


    public int getNumberOfColumns(){
        return columns;
    }


    public void insert(String[] input){

        if(input.length != 4){
           return; 
        }

        for(int i = 0; i < input.length; i++){

            listArray[i].add(input[i]);
        }
    }


    public void clearTable(){
        
        for(int i = 0; i < listArray.length; i++){
            list.clear();
        }
    }


    public void printTable(){

        for(int k = 0; k < list.size(); k++){

            System.out.print("|| ");
            for(int i = 0; i < listArray.length; i++){
                
                System.out.print(listArray[i].get(k) + " ");
            }
            System.out.print("||");
            System.out.println();

        }
    }


    @Override
    public String toString(){

        return "|| Table: " + nameOfTable + ", " + rows + "x" + columns + " ||";
    }

}