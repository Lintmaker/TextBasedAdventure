package Game;

import Rooms.PrincessSnakeFillerRoom;
import Rooms.Tile;
import Rooms.Wall;
import Saiyan.Goku;
import Board.Board;
import java.util.Scanner;
import static Game.TrapTile.TrapCounter;
import Game.TrapTile;
public class Runner {


        private static boolean gameOn = true;

        public static void main(String[] args)
        {
            System.out.println("You've been killed by Raditz. \n" +
                    " The Dragonballs were used to transport you to any part of Snake Way to train with King Kai. \n " +
                    "Would you like to have 100 mile, 1000 mile or the million mile?");
           Scanner Difficulty = new Scanner (System.in);
           String miles = Difficulty.nextLine();
           if (miles.equals("100 mile"))
           {
               Tile[][] building = new Tile[5][5];
               //Fill the building with normal rooms
               for (int x = 0; x < building.length; x++) {
                   for (int y = 0; y < building[x].length; y++) {
                       building[x][y] = new Tile(x, y);
                   }
               }

               //Create a random winning room.
               //int x = (int)(Math.random()*building.length);
               //int y = (int)(Math.random()*building.length);
               int i = (int) (Math.random() * building.length - 1);
               int l = (int) (Math.random() * building.length - 1);
               for (int z = 0; z < TrapCounter(); z++) {
                   int x = (int) (Math.random() * building.length);
                   int y = (int) (Math.random() * building.length);
                   building[x][y] = new TrapTile(x, y);

               }
               //building[x][y] = new WinningRoom(x, y);
               building [1][1] = new PrincessSnakeFillerRoom(1,1) ;
               building[0][4] = new Wall(0, 4);
               building[0][0] = new Wall(0, 0);
               building[0][1] = new Wall(0, 0);
               building[0][2] = new Wall(0, 0);
               building[1][0] = new Wall(1, 0);
               building[2][0] = new Wall(2, 0);
               building[2][1] = new Wall(2, 1);
               building[2][2] = new Wall(2, 2);
               building[2][3] = new Wall(2, 3);
               building[4][4] = new Wall(4, 4);
               building[4][1] = new Wall(4, 1);
               building[4][2] = new Wall(4, 2);
               building[4][3] = new Wall(4, 3);
               //Setup player 1 and the input scanner
               Goku player1 = new Goku("FirstName", "FamilyName", 4, 0);
               building[4][0].enterRoom(player1);
               Board Snake = new Board(building); // the building was already made above by the constructor.
               Snake.printBoard();
               Scanner in = new Scanner(System.in);
               while (gameOn) {
                   System.out.println("Where would you like to move? (Choose N, S, E, W) \n" +
                           "If you want help, (Choose H)");
                   String move = in.nextLine();
                   if (validMove(move, player1, Snake.getBoard())) {
                       Snake.printBoard();
                       System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
                   } else {
                       Snake.printBoard();
                       System.out.println("Please choose a valid move.");
                   }

               }
               in.close();
           }

           else if( miles.equals("1000 mile"))
           {
               Tile[][] HiflBoard = new Tile[6][6];
               for (int x = 0; x < HiflBoard .length; x++)
               {
                   for (int y = 0; y < HiflBoard [x].length; y++)
                   {
                       HiflBoard [x][y] = new Tile(x, y);
                   }
               }
               for (int z = 0; z < TrapCounter(); z++)
               {
                   int x = (int) (Math.random() * HiflBoard.length);
                   int y = (int) (Math.random() * HiflBoard.length-1);
                   HiflBoard[x][y] = new TrapTile(x, y);

               }
               HiflBoard [5][0] = new Wall(5, 0);
               HiflBoard [5][1] = new Wall(5, 1);
               HiflBoard [5][2] = new Wall(5, 2);
               HiflBoard [5][3] = new Wall(5, 3);
               HiflBoard [5][4] = new Wall(5, 4);
               HiflBoard [4][0] = new Wall(4, 0);
               HiflBoard [4][1] = new Wall(4, 1);
               HiflBoard [4][2] = new Wall(4, 2);
               HiflBoard [4][3] = new Wall(4, 3);
               HiflBoard [4][4] = new Wall(4, 4);
               HiflBoard [3][0] = new Wall(3, 0);
               HiflBoard [3][1] = new Wall(3, 1);
               HiflBoard [3][2] = new Wall(3, 2);
               HiflBoard [2][5] = new Wall(2, 5);
               HiflBoard [2][4] = new Wall(2, 4);
               HiflBoard [0][0] = new Wall(0, 0);
               HiflBoard [0][1] = new Wall(0, 1);
               HiflBoard [1][0] = new Wall(1, 0);
               HiflBoard [1][1] = new Wall(1, 1);
               HiflBoard [1][4] = new Wall(1, 4);
               HiflBoard [1][3] = new Wall(1, 3);
               HiflBoard [1][5] = new Wall(1, 5);
               HiflBoard [2][0] = new PrincessSnakeFillerRoom(5, 1);
               Goku player1 = new Goku("FirstName", "FamilyName", 5, 5);
               HiflBoard [5][5].enterRoom(player1);
               Board Snake = new Board(HiflBoard); // the building was already made above by the constructor.
               Snake.printBoard();
               Scanner in = new Scanner(System.in);

               while (gameOn) {
                   System.out.println("Where would you like to move? (Choose N, S, E, W)");
                   String move = in.nextLine();
                   if (validMove(move, player1, Snake.getBoard()))
                   {
                       Snake.printBoard();
                       System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
                   } else {
                       Snake.printBoard();
                       System.out.println("Please choose a valid move.");
                   }

               }
               in.close();
           }
           else
           {
               Tile[][] HiflBoard = new Tile[6][6];
               for (int x = 0; x < HiflBoard.length; x++)
               {
                   for (int y = 0; y < HiflBoard[x].length; y++)
                   {
                       HiflBoard [x][y] = new Tile(x, y);
                   }
               }
               for (int z = 0; z < TrapCounter(); z++)
               {
                   int x = (int) (Math.random() * HiflBoard.length);
                   int y = (int) (Math.random() * HiflBoard.length-1);
                   HiflBoard[x][y] = new TrapTile(x, y);

               }
               HiflBoard [5][0] = new Wall(5, 0);
               HiflBoard [5][1] = new Wall(5, 1);
               HiflBoard [5][2] = new Wall(5, 2);
               HiflBoard [5][3] = new Wall(5, 3);
               HiflBoard [5][4] = new Wall(5, 4);
               HiflBoard [3][1] = new Wall(3, 1);
               HiflBoard [3][2] = new Wall(3, 2);
               HiflBoard [3][3] = new Wall(3, 3);
               HiflBoard [3][4] = new Wall(3, 4);
               HiflBoard [1][0] = new Wall(1, 0);
               HiflBoard [1][1] = new Wall(1, 1);
               HiflBoard [1][2] = new Wall(1, 2);
               HiflBoard [1][3] = new Wall(1, 3);
               HiflBoard [0][5] = new Wall(0, 2);
               HiflBoard [1][5] = new Wall(0, 3);
               HiflBoard [2][0] = new PrincessSnakeFillerRoom(2, 0) ;
               Goku player1 = new Goku("FirstName", "FamilyName", 5, 5);
               HiflBoard [5][5].enterRoom(player1);
               Board Snake = new Board(HiflBoard); // the building was already made above by the constructor.
               Snake.printBoard();
               Scanner in = new Scanner(System.in);

               while (gameOn) {
                   System.out.println("Where would you like to move? (Choose N, S, E, W)");
                   String move = in.nextLine();
                   if (validMove(move, player1, Snake.getBoard()))
                   {
                       Snake.printBoard();
                       System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
                   } else {
                       Snake.printBoard();
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
                    System.out.println("The Xs are walls you cannot pass, \n " +
                            "maybe you can try to find the filler room. \n " +
                            "You may get something that'll be of use. \n" +
                            "If you have that special item, input u to use.");
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



