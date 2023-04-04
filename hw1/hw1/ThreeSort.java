// ThreeSort.java: Takes three integers as command-line arguments and writes
// them in ascending order, separated by spaces.

public class ThreeSort {
    public static void main(String[] args) {

        int num, num2, num3 = 0;
        int small, mid, max = 0;


        // takes in arguments to later sort
        num = Integer.parseInt(args[0]);

        num2 = Integer.parseInt(args[1]);

        num3 = Integer.parseInt(args[2]);

        // calculates smallest number
        small = Math.min(num, num2);
        small = Math.min(small, num3);

        //calculates highest number
        max = Math.max(num, num2);
        max = Math.max(max, num3);

        //finds the middle sized number
        if (small != num && max != num) {
            mid = num;
        } else if (small != num2 && max != num2) {
            mid = num2;
        } else {
            mid = num3;
        }

        System.out.println(small + " " + mid + " " + max);
    }
}
