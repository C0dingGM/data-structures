import java.util.*;

public class Grid
{
    private static final int SIZE = 10;
    int[][] pixels = new int[SIZE][SIZE];
    int fillnum = 1;
    Stack<Pair> cords = new Stack<>();
   
    /**
     * Flood fill, starting with the given row and column.
    */
    public void floodfill(int iRow, int iColumn)
    {
        
        cords.add(new Pair(iRow, iColumn));
        int num = 0;
        while (!cords.isEmpty()){
            Pair cord = cords.pop();
            int row = cord.row;
            int col = cord.col;

            if (row >