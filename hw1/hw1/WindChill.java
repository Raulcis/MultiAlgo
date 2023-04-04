// WindChill.java: Takes two doubles t and v as command-line arguments and
// writes the wind chill w, calculated as w=35.74+0.6215t+(0.4275t-35.75)v^0.16.

public class WindChill {
    public static void main(String[] args) {

        //collects input value to calculate the wind chills
        double temp = Double.parseDouble(args[0]);
        double chills = 0;
        double wind = Double.parseDouble(args[1]);

        chills = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(wind, 0.16); // calculates wind chill

        System.out.println(chills);


    }
}
