//Author Lin Yao Pan
package Game;

import Rooms.*;
import Saiyan.Goku;
import Board.Board;
import java.util.Scanner;
public class Runner {
        private static boolean gameOn = true;

        public static void main(String[] args)
        {
            Board map = new Board(0,0);
            int length = 0;
            int width = 0;
            System.out.println("You've been killed by Raditz. \n" +
                    " The Dragonballs were used to transport you to any part of Snake Way to train with King Kai for the Saiyan threat coming to Earth. \n " +
                    "Would you like to have 100, 1000 or the million mile?");
           Scanner Difficulty = new Scanner (System.in);
           String miles = Difficulty.nextLine();
           if (miles.equals("100") || (miles.equals("100 mile"))) {
               map = new Board(miles);
               length = map.getLength();
               width = map.getWidth();
               //Fill the map with normal tiles
               for (int x = 0; x < map.getBoard().length; x++) {
                   for (int y = 0; y < map.getBoard()[x].length; y++) {
                       map.getBoard()[x][y] = new Tile(x, y);
                   }
               }
               map.getBoard()[2][0] = new PrincessSnakeFillerRoom(2, 0);
               map.getBoard()[0][4] = new Wall(0, 4);
               map.getBoard()[0][0] = new Wall(0, 0);
               map.getBoard()[0][1] = new Wall(0, 0);
               map.getBoard()[0][2] = new Wall(0, 0);
               map.getBoard()[1][0] = new Wall(1, 0);
               map.getBoard()[2][1] = new Wall(2, 1);
               map.getBoard()[2][2] = new Wall(2, 2);
               map.getBoard()[2][3] = new Wall(2, 3);
               map.getBoard()[4][4] = new Wall(4, 4);
               map.getBoard()[4][1] = new Wall(4, 1);
               map.getBoard()[4][2] = new Wall(4, 2);
               map.getBoard()[3][5] = new Wall(3, 5);
               map.getBoard()[0][5] = new Wall(0, 5);
               map.getBoard()[1][5] = new Wall(1, 5);
               map.getBoard()[2][5] = new Wall(2, 5);
               map.getBoard()[4][5] = new Wall(4, 5);
               map.getBoard()[5][5] = new Wall(5, 5);
               map.getBoard()[4][0] = new TrapTile(4, 0);
               map.getBoard()[0][3] = new FinalTile(0, 3);
               //Setup player 1 and the input scanner
               Goku player1 = new Goku("FirstName", "FamilyName", 4, 0);
               map.getBoard()[4][0].enterRoom(player1);
               map.print();
               Scanner in = new Scanner(System.in);
               while (gameOn) {
                   System.out.println("Where would you like to move? (Choose N, S, E, W) \n" +
                           "If you want help, choose H");
                   String move = in.nextLine();
                   if (validMove(move, player1, map.getBoard())) {
                       map.print();
                       System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
                   } else {
                       map.print();
                       System.out.println("Please choose a valid move.");
                   }

               }
               in.close();
           }
            else if (miles.equals("1000") || miles.equals("1000 mile"))
            {
                map = new Board(miles);
                length = map.getLength();
                width = map.getWidth();
               for (int x = 0; x < map.getBoard().length; x++) {
                   for (int y = 0; y < map.getBoard()[x].length; y++) {
                       map.getBoard()[x][y] = new Tile(x, y);
                   }
               }
               map.getBoard()[5][0] = new Wall(5, 0);
               map.getBoard()[5][1] = new Wall(5, 1);
               map.getBoard()[5][2] = new Wall(5, 2);
               map.getBoard()[5][3] = new Wall(5, 3);
               map.getBoard()[5][4] = new Wall(5, 4);
               map.getBoard()[4][0] = new Wall(4, 0);
               map.getBoard()[4][1] = new Wall(4, 1);
               map.getBoard()[4][2] = new Wall(4, 2);
               map.getBoard()[4][3] = new Wall(4, 3);
               map.getBoard()[4][4] = new Wall(4, 4);
               map.getBoard()[3][0] = new Wall(3, 0);
               map.getBoard()[3][1] = new Wall(3, 1);
               map.getBoard()[3][2] = new Wall(3, 2);
               map.getBoard()[2][5] = new Wall(2, 5);
               map.getBoard()[2][4] = new Wall(2, 4);
               map.getBoard()[0][0] = new Wall(0, 0);
               map.getBoard()[0][1] = new Wall(0, 1);
               map.getBoard()[1][0] = new Wall(1, 0);
               map.getBoard()[1][1] = new Wall(1, 1);
               map.getBoard()[1][4] = new Wall(1, 4);
               map.getBoard()[1][3] = new Wall(1, 3);
               map.getBoard()[1][5] = new Wall(1, 5);
               map.getBoard()[5][5] = new TrapTile(5, 5);
               map.getBoard()[2][0] = new PrincessSnakeFillerRoom(2, 0);
               map.getBoard()[0][5] = new FinalTile(0, 5);
               Goku player1 = new Goku("FirstName", "FamilyName", 5, 5);
               map.getBoard()[5][5].enterRoom(player1);
               map.print();
               Scanner in = new Scanner(System.in);

               while (gameOn) {
                   System.out.println("Where would you like to move? (Choose N, S, E, W) \n" +
                           "If you want help, choose H.");
                   String move = in.nextLine();
                   if (validMove(move, player1, map.getBoard())) {
                       map.print();
                       System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
                   } else {
                       map.print();
                       System.out.println("Please choose a valid move.");
                   }

               }
               in.close();
           }
            else {
               map = new Board(miles);
               length = map.getLength();
               width = map.getWidth();
               for (int x = 0; x < map.getBoard().length; x++) {
                   for (int y = 0; y < map.getBoard()[x].length; y++) {
                       map.getBoard()[x][y] = new Tile(x, y);
                   }
               }
               map.getBoard()[5][0] = new Wall(5, 0);
               map.getBoard()[5][1] = new Wall(5, 1);
               map.getBoard()[5][2] = new Wall(5, 2);
               map.getBoard()[5][3] = new Wall(5, 3);
               map.getBoard()[5][4] = new Wall(5, 4);
               map.getBoard()[3][1] = new Wall(3, 1);
               map.getBoard()[3][2] = new Wall(3, 2);
               map.getBoard()[3][3] = new Wall(3, 3);
               map.getBoard()[3][4] = new Wall(3, 4);
               map.getBoard()[1][0] = new Wall(1, 0);
               map.getBoard()[1][1] = new Wall(1, 1);
               map.getBoard()[1][2] = new Wall(1, 2);
               map.getBoard()[1][3] = new Wall(1, 3);
               map.getBoard()[0][5] = new Wall(0, 2);
               map.getBoard()[1][5] = new Wall(0, 3);
               map.getBoard()[2][0] = new PrincessSnakeFillerRoom(2, 0);
               map.getBoard()[5][5] = new TrapTile(5, 5);
               map.getBoard()[0][0] = new FinalTile(0, 0);
               Goku player1 = new Goku("FirstName", "FamilyName", 5, 5);
               map.getBoard()[5][5].enterRoom(player1);
               map.print();
               Scanner in = new Scanner(System.in);

               while (gameOn) {
                   System.out.println("Where would you like to move? (Choose N, S, E, W) \n" +
                           "If you want help, choose H.");
                   String move = in.nextLine();
                   if (validMove(move, player1, map.getBoard())) {
                       map.print();
                       System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
                   } else {
                       map.print();
                       System.out.println("Please choose a valid move.");
                   }

               }
               in.close();
           }

        }

        /**
         * Checks that the movement chosen is within the valid game map.
         * @param move the move chosen
         * @param p person moving
         * @param map the 2D array of rooms
         * @return
         */
        public static boolean validMove(String move, Goku p, Tile[][] map)
        {
            move = move.toLowerCase().trim();
            switch (move) {
                case "n":
                    if (p.getxLoc() > 0 && map[p.getxLoc()-1][p.getyLoc()].invalidMove())
                    {
                        map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                        map[p.getxLoc()-1][p.getyLoc()].enterRoom(p);
                        return true;
                    }
                    else //Make it always false when x and y loc = wall
                    {
                        return false;
                    }
                case "e":
                    if (p.getyLoc()< map[p.getyLoc()].length -1 && map[p.getxLoc()][p.getyLoc() + 1].invalidMove())
                    {
                        map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                        map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
                        return true;
                    }
                    else
                    {
                        return false;
                    }

                case "s":
                    if (p.getxLoc() < map.length - 1 && map[p.getxLoc()+1][p.getyLoc()].invalidMove())
                    {
                        map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                        map[p.getxLoc()+1][p.getyLoc()].enterRoom(p);
                        return true;
                    }
                    else
                    {
                        return false;
                    }

                case "w":
                    if (p.getyLoc() > 0 && map[p.getxLoc()][p.getyLoc()-1].invalidMove())
                    {
                        map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                        map[p.getxLoc()][p.getyLoc()-1].enterRoom(p);
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                case "h":
                    System.out.println("The [X]s are walls you cannot pass, \n " +
                            "The way out is the FinalTile defined by the [F]\n" +
                            "Maybe you can try to find the filler room. \n " +
                            "You may get a nice surprise.");

                default:
                    break;

            }
            return true;
        }
        public static void gameOff()
        {
            gameOn = false;
        }

    }



