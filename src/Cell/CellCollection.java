package Cell;

public class CellCollection {
    Cell[] cells;
    int index=0;

    public CellCollection(int size){
        cells = new Cell[size];
    }//end constructor
    public void add(Cell c){
        cells[index]= c;
        index++;
    }
    public Cell get(int i){
        return cells[i];
    }//end method get
}//end class CellCollection
