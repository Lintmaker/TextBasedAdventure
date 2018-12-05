package Board;

import Rooms.Tile;

public class Board implements BasicFunction
{
 private Tile [][] Board;

 public Board (Tile [] [] Board)
 {
     this.Board = Board;
 }
    public void fill ()
    {
        String play = "";
        for(int i = 0; i < Board.length; i++)
        {
            for( int x = 0; x < Board[i].length; x++)
            {
                play += Board[i][x];
                System.out.println(play);
            }
        }

    }
    public void printBoard()
    {
     String parts = "";
     for (int i = 0; i < Board.length; i++)
     {
         parts = "";
         for(int x = 0; x < Board.length; x++)
         {
            parts = parts + Board[i][x].toString();
         }
         System.out.println(parts + "\n");
     }
    }
/*
    public void edit(Tile [] [] Spike ( int row, int column))
    {
        Wall[row][column] = Wall;
    }

 */
    public Tile[][] getBoard()
    {
        return Board;
    }

    @Override
    public String toString()
    {
         return "";
    }
}
