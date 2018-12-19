//Author Lin Yao Pan
package Rooms;
import Game.Runner;
import Saiyan.Goku;
/*
* Creates a final tile to end the game
* @param Tile class, makes a tile to move into and finish the game
* prints a room to use
 */
public class FinalTile extends Tile implements BasicFunction
{
    public FinalTile  (int x, int y)
    {
        super(x, y);
    }
    public String toString()
    {
        return "[F]";
    }
    @Override
    public boolean invalidMove()
    {
        return true;
    }

    @Override
    public void enterRoom(Goku x)
    {
        System.out.println("You have finished the game, but was it too late? \n" +
                "Yamcha has been destroyed by a self destruct, Tien lost his life and his arm, and Chaotzu is... \n" +
                "Well we don't need to talk about it. You manage to drive off the Saiyan threat with your mere presence. Congradulations.");
        Runner.gameOff();
    }
}
