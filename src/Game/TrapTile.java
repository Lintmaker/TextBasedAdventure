package Game;
import Rooms.BasicFunction;
import Saiyan.Goku;
import Rooms.Tile;

public class TrapTile extends Tile implements BasicFunction
{
    Goku occupant;
    public TrapTile (int x, int y)
    {
        super(x, y);
    }
    public String toString()
    {
        return "[ ]";
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

    @Override
    public void enterRoom(Goku x)
    {
        System.out.println("Welcome to HIFL, You need to find the right tile to escape");
    }
}


