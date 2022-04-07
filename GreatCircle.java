/**
 *  Floating-point numbers and the Math library.
 *  The great-circle distance is the length of the shortest path between
 *  two points (x1,y1) and (x2,y2) on the surface of a sphere,
 *  where the path is constrained to be along the surface.
 *  Write a program GreatCircle.java that takes four double command-line arguments x1, y1, x2,
 *  and y2—the latitude and longitude (in degrees)
 *  of two points on the surface of the earth—and prints the great-circle distance (in kilometers)
 *  between them. Use the following Haversine formula
 *  distance= 2*r*arcs(sqrt(pow(sin((x2-x1)/2),2)+cos(x1)*cos(x2)*pow(sin((y2-y1)/2),2)
 *  where r=6,371.0 is the mean radius of the Earth (in kilometers).
 */
import java.lang.Math;

public class GreatCircle {

    public static void main(String[] args) {
        double x1,y1,x2,y2;
        x1=Double.parseDouble(args[0]);
        y1=Double.parseDouble(args[1]);
        x2=Double.parseDouble(args[2]);
        y2=Double.parseDouble(args[3]);
        x1=Math.toRadians(x1);
        x2=Math.toRadians(x2);
        y1=Math.toRadians(y1);
        y2=Math.toRadians(y2);

        final double r = 6371;
        double distance= 2*r*Math.asin(Math.sqrt(Math.pow(Math.sin((x2-x1)/2),2)+Math.cos(x1)*Math.cos(x2)*Math.pow(Math.sin((y2-y1)/2),2)));
        System.out.println(distance+ " kilometers");
    }
}
