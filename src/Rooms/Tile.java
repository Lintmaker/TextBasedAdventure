//Author Lin Yao Pan
package Rooms;
import Saiyan.Goku;
/*
 * Creates the tile format to initialize and set up the rest of the game
 * @param Tile class, makes a tile to move into for the whole board
 * prints rooms to use
 */
public class Tile implements BasicFunction
{
    Goku occupant;
    int xLoc,yLoc;
    public Tile(int x, int y)
    {
        xLoc = x;
        yLoc = y;
    }

    /**
     * Method controls the results when a person enters this room.
     * @param x the Person entering
     */
    public void enterRoom(Goku x)
    {
        System.out.println("You trudge forward: tile after tile.");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }

    /**
     * Removes the player from the room.
     * @param x
     */
    public void leaveRoom(Goku x)
    {
        occupant = null;
    }

    @Override
    public String toString()
    {
        if (occupant != null) {
            return "[G]";
        }
        return "[ ]";
    }
    @Override
    public boolean invalidMove()
    {
        return true;
    }
}
