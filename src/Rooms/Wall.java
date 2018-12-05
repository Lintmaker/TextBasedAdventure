package Rooms;
import Saiyan.Goku;
public class Wall extends Tile implements BasicFunction
{
    Goku occupant;
    public Wall (int x, int y)
    {
        super(x, y);
    }
    public String toString()
    {
        return "-";
    }
    @Override
    public boolean invalidMove()
    {
        return false;
    }



}
