package Game;
import Board.Board;
import Rooms.BasicFunction;
import Saiyan.Goku;
import Rooms.Tile;
import Game.Runner;

import java.util.Scanner;

public class TrapTile extends Tile implements BasicFunction
{
    Goku occupant;
    public TrapTile (int x, int y)
    {
        super(x, y);
    }
    public TrapTile (int count)
    {
        super(count);
    }

   public static int TrapCounter()
   {
       return 5;
   }

    @Override
    public boolean invalidMove()
    {
        return true;
    }

  public static void KonamiCode()
  {
      String code = "";
      int correct = 5;
      Scanner Konami = new Scanner(System.in);
      code = Konami.nextLine();
      for (int z = 0; z < correct; z++)
      {
          if (!code.equals("up up down down left right left right b a start")) {
              correct += correct;
              System.out.println("I want the whole code at once with spaces fool.");
          }
          else
          {
              z= correct;
          }

      }
  }
    @Override
    public void enterRoom(Goku x)
    {

        System.out.println("Welcome to HIFL, You need to pay homage to Konami to escape.");
        TrapTile.KonamiCode();
    }
    public void leaveRoom(Goku x)
    {
        occupant = null;
    }
    public boolean isTrap() {return true;}
    public String toString()
    {
        if (occupant != null)
        {
            return "[G]";
        }
        return "[ ]";
    }
}


