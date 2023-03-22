import java.util.Random;

/**
 * This program simulates a 3 wheel slot machine
 * 
 * @author Matthew Warner
 * @version Spring 2023
 */

public class slots {
    
    public static void main(String args[]) {

        int wheel1, wheel2, wheel3, coins = 10, spins = 0;
        Random rand = new Random();

        while (coins > 0) {
            spins++; //keep track of total spins
            coins--; //each spin costs 1 coin
            wheel1 = rand.nextInt(4); //roll wheel1
            wheel2 = rand.nextInt(4); //roll wheel2
            wheel3 = rand.nextInt(4); //roll wheel3

            //Bar = 0, Bell = 1, Lemon = 2, Cherry = 3
            //all bars
            if (wheel1 == 0 && wheel2 == 0 && wheel3 == 0) {
                coins += 20;
                //System.out.println("Wheel1: " + wheel1 + " Wheel2: " + wheel2 + " Wheel3: " + wheel3);
            }
            
            //all bells
            else if (wheel1 == 1 && wheel2 == 1 && wheel3 == 1) {
                coins += 15;
                //System.out.println("Wheel1: " + wheel1 + " Wheel2: " + wheel2 + " Wheel3: " + wheel3);
            }

            //all lemons
            else if (wheel1 == 2 && wheel2 == 2 && wheel3 == 2) {
                coins += 5;
                //System.out.println("Wheel1: " + wheel1 + " Wheel2: " + wheel2 + " Wheel3: " + wheel3);
            }

            //all cherries
            else if (wheel1 == 3 && wheel2 == 3 && wheel3 == 3) {
                coins += 3;
                //System.out.println("Wheel1: " + wheel1 + " Wheel2: " + wheel2 + " Wheel3: " + wheel3);
            }

            //two cherries and a non cherry
            else if (wheel1 == 3 && wheel2 == 3 && wheel3 != 3) {
                coins += 2;
                //System.out.println("Wheel1: " + wheel1 + " Wheel2: " + wheel2 + " Wheel3: " + wheel3);
            }

            //a cherry, a non-cherry, and anything
            else if ((wheel1 == 3) && (wheel2 != 3)) {
                coins += 1;
                //System.out.println("Wheel1: " + wheel1 + " Wheel2: " + wheel2 + " Wheel3: " + wheel3);
            }
            
            //System.out.println("total coins right now " + coins);
        }

        System.out.println("It took " + spins + " before you went broke.");

    }


}
