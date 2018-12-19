//Author Lin Yao Pan
package Board;
import Rooms.Tile;
import Rooms.Wall;
public class Board
    {
        private Tile [][] Board;
        private String difficulty;
        private int length;
        private int width;
        /*
        @param String, creates a board based on difficulty.
         */
        public Board (String difficulty)
        {
            this.difficulty = difficulty;

            if (difficulty.equals("100") || difficulty.equals("100 mile")) {
                this.length = 6;
                this.width = 6;
                this.Board = new Tile[6][6];
            }
            if (difficulty.equals("1000") || difficulty.equals("1000 Mile")) {
                this.length = 6;
                this.width = 6;
                this.Board = new Tile[6][6];
            } else
                {
                this.length = 6;
                this.width = 6;
                this.Board = new Tile[6][6];
            }
        }
        /*
        @param in, for calling length and width from the runner
        */
        public int getLength() {
            return length;
        }

        public int getWidth() {
            return width;
        }

            /*
            @param board, helps create all the tiles
             */
             public Board(int length, int width)
            {
                this.length = length;
                this.width = length;
                this.Board = new Tile[length][width];
            }
            /*
            @param 2D array, for the board
             */
            public Tile[][] getBoard()
            {
                return this.Board;
            }
        /*
        @param void, prints out the board
         */
        public void print()
        {
            String result="";
            for (int i = 0; i<Board.length; i++ )
            {
                result="";
                for (int j =0; j< Board[i].length; j++)
                {
                    result = result+this.Board[i][j].toString();
                }
                System.out.println(result);
            }
        }


}
