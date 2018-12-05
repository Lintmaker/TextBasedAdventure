package Rooms;
import Saiyan.Goku;
public class Wall extends Tile
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


}
