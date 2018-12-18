package Rooms;
import Game.Runner;
import Saiyan.Goku;
/*
 * Creates an alternate final tile to end the game
 * @param Tile class, makes a tile to move into and finish the game
 * prints a room to use
 */
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
        System.out.println("Welcome, sit down. Take a moment and enjoy yourself. You found a secret.\n " +
                "3 \n" +
                "2 \n" +
                "1 \n" +
                "Okay now you get to finish the game early. \n" +
                "Since you got there early, Vegeta and Nappa couldn't kill everyone you loved. You have saved the Earth.");
        Runner.gameOff();
    }

    @Override
    public boolean invalidMove()
    {
        return true;
    }
}
