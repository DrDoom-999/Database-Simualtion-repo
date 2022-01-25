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
    private ArrayList<String[]> list = new ArrayList<String[]>();

    
    public Table(String nameOfTable, int rows, int columns){

        this.nameOfTable = nameOfTable;
        this.rows = rows;
        this.columns = columns;
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

        if(input.length != columns){

            throw new ArrayNotInTheRightFormException();
        }

        list.add(input);
    }


    public String getRow(int position){

        if(position > list.size()-1){
            throw new ThisRowDoesntExistException();
        }

        String contentOfRow = "";
        String[] array = list.get(position);

        for(int i = 0; i < array.length; i++){

            contentOfRow += array[i];
            contentOfRow += " ";
        }

        return contentOfRow;
    }


    public void deleteRow(int position){

        if(position > list.size()-1){
            throw new IndexOutOfBoundsException();
        }

        list.remove(position);
    }


    public void clearTable(){

        list.clear();
    }


    public void printTable(){

        for(int i = 0; i < list.size(); i++){

            String[] array = list.get(i);

            for(int k = 0; k < array.length; k++){
                System.out.print(array[k] + " ");
            }
            System.out.println();
        }
    }


    @Override
    public String toString(){

        return "|| Table: " + nameOfTable + ", " + rows + "x" + columns + " ||";
    }

}
