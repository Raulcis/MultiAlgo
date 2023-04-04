// ThreeDice.java: Writes the sum of three random integers between 1 and 6, such
// as you might get when rolling three dice.

import java.util.Random;

public class ThreeDice {
    public static void main(String[] args) {
        int num, num2, num3 = 0;
        int total = 0;

        Random rand = new Random(); //calls method to generate random seed

        // Generate random integers in range 1 to 6
        num = rand.nextInt(6) + 1;
        num2 = rand.nextInt(6) + 1;
        num3 = rand.nextInt(6) + 1;

        total = num + num2 + num3; // adds dice results

        System.out.println(total);
    }
}
