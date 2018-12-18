//Author Lin Yao Pan
package Rooms;
public class Wall extends Tile implements BasicFunction
{
    public Wall (int x, int y)
    {
        super(x, y);
    }
    public String toString()
    {
        return "[X]";
    }
    @Override
    public boolean invalidMove()
    {
        return false;
    }



}
