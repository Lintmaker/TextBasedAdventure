package Rooms;
import Saiyan.Goku;
public class Tile implements BasicFunction
{
    Goku occupant;
    int xLoc,yLoc;
    private int count;
    public Tile(int x, int y)
    {
        xLoc = x;
        yLoc = y;
    }
    public Tile (int count)
    {
        this.count = count;
    }

    /**
     * Method controls the results when a person enters this room.
     * @param x the Person entering
     */
    public void enterRoom(Goku x)
    {
        System.out.println("You enter a plain old room");
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
