//Author Lin Yao Pan
package Rooms;
import Saiyan.Goku;

import java.util.Scanner;
/*
 * Creates a starting tile to annoy in the beginning of the game
 * @param Tile class, is placed into the starting position based on the miles traveled
 * prints a command they have to abide by.
 */
public class TrapTile extends Tile implements BasicFunction
{
    Goku occupant;
    public TrapTile (int x, int y)
    {
        super(x, y);
    }
    @Override
    public boolean invalidMove()
    {
        return true;
    }

  public static void KonamiCode()
  {
      int correct = 3;
      Scanner Konami = new Scanner(System.in);
      String code = Konami.nextLine();
      for (int z = 0; z < correct; z++)
      {
          if (code.equals("up up down down left right left right b a start")) {
              correct = z;
          }
          else
          {
              correct = correct + 1;
              System.out.println("You have not coded correctly, fortunately there is the internet.");
              code = Konami.nextLine();
          }

      }
  }
    @Override
    public void enterRoom(Goku x)
    {

        System.out.println("Welcome to HIFL, You must type in the Konami code without uppercase and with spaces after every input. ");
        TrapTile.KonamiCode();
        System.out.println("Now you may start the game since I've taught you about another.");
    }
    public void leaveRoom(Goku x)
    {
        occupant = null;
    }
    public String toString()
    {
        if (occupant != null)
        {
            return "[G]";
        }
        return "[ ]";
    }
}


