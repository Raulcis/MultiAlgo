// Distance.java: reads two position vectors from standard input, and then
// computes and writes the Manhattan distance between the two.

import edu.princeton.cs.algs4.StdArrayIO;
import edu.princeton.cs.algs4.StdOut;

public class Distance {
    // Returns the Euclidean distance between the position vectors x and y.
    private static double distance(double[] x, double[] y) {

        double sum = 0;
        double num = 0;
        int size = x.length; //get array size

        for (int i = 0; i < size; i++) {

            num = (Math.abs(x[i] - y[i])); // calculates Manhatten distance between the points

            sum += num;
            num = 0;
        }
        return sum; // returns final sum
    }

    // Entry point. [DO NOT EDIT]
    public static void main(String[] args) {
        double[] x = StdArrayIO.readDouble1D();
        double[] y = StdArrayIO.readDouble1D();
        StdOut.println(distance(x, y));
    }
}


