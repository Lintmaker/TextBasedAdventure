package Saiyan;

public class Goku
{
        String firstName;
        String familyName;
        int xLoc, yLoc;


        public int getxLoc() {
            return xLoc;
        }

        public void setxLoc(int xLoc) {
            this.xLoc = xLoc;
        }

        public int getyLoc() {
            return yLoc;
        }

        public void setyLoc(int yLoc) {
            this.yLoc = yLoc;
        }

        public Goku (String firstName, String familyName, int xLoc, int yLoc)
        {
            this.firstName = firstName;
            this.familyName = familyName;
            this.xLoc = xLoc;
            this.yLoc = yLoc;
        }


    }
