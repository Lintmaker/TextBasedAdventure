package Board;

import Rooms.Tile;

public class Board implements BasicFunction
{
 private Tile [] [] Board;

 public Board (Tile [] [] Board)
 {
     this.Board = Board;
 }
    public  void fill ()
    {
        for(int i = 0; i < Board.length; i++)
        {
            for( int x = 0; x < Board[i].length; x++)
            {
                System.out.println(Board[i][x]);
            }
        }
    }
}
