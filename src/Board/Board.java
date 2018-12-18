//Author Lin Yao Pan
package Board;
import Rooms.Tile;
import Rooms.Wall;
public class Board
    {
        private Tile [][] Board;
        private String difficulty;
        private int height;
        private int width;

        public Board (String difficulty)
        {
            this.difficulty = difficulty;

            if (difficulty.equals("100 mile") || difficulty.equals("100 Mile")) {
                this.height = 5;
                this.width = 5;
                this.Board = new Tile[5][5];
            }
            if (difficulty.equals("1000 mile") || difficulty.equals("1000 Mile")) {
                this.height = 6;
                this.width = 6;
                this.Board = new Tile[6][6];
            } else {
                this.height = 6;
                this.width = 6;
                this.Board = new Tile[6][6];
            }
        }
             public Board(int height, int width)
            {
                this.height = height;
                this.width = height;
                this.Board = new Tile[height][width];
            }
            public Tile[][] getBoard()
            {
                return this.Board;
            }


            public void printBoard()
            {
                String parts = "";
                for (int i = 0; i < this.Board.length; i++) {
                    parts = "";
                    for (int x = 0; x < this.Board.length; x++) {
                        parts = parts + this.Board[i][x].toString();
                    }
                    System.out.println(parts + "\n");
                }
            }


}
