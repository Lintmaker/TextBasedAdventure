package Rooms;
import Saiyan.Goku;

public class PrincessSnakeFillerRoom extends Tile implements BasicFunction
{
    Goku occupant;
    public PrincessSnakeFillerRoom (int x, int y)
    {
        super(x,y);
    }
    public String toString()
    {
        if (occupant != null) {
            return "[G]";
        }
        return "[O]";
    }

    @Override
    public void enterRoom(Goku x)
    {
        System.out.println("Welcome, sit down. Take a moment and enjoy yourself. \n " +
                "Let me bring you your nimbus.");
    }

    @Override
    public boolean invalidMove()
    {
        return true;
    }
}
