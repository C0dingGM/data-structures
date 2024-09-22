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

            if (row >= 0 && row < 10 && col >= 0 && col < 10 && pixels[row][col] == 0){
                pixels[row][col] = fillnum++;

                
                
                
                cords.push(new Pair(row-1, col));
                cords.push(new Pair(row, col+1));
                cords.push(new Pair(row+1, col));
                cords.push(new Pair(row, col-1));
                 
                
                
                
                

            } 
            num++;
            /*
             for (int i = 0; i < pixels.length; i++){
                for (int x = 0; x < pixels.length; x ++){
                    System.out.print(pixels[i][x]+ " ");
                }
                System.out.println();
            }
            System.out.println();
            

        }
             */
            
        
        }
       
    }

    @Override
    public String toString()
    {
        String r = "";
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
                r = r + String.format("%4d", pixels[i][j]);
            r = r + "\n";
        }
        return r;
    }
}
