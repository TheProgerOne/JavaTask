/**
 * Integers and booleans.
 * Write a program RightTriangle that takes three int command-line arguments and
 * determines whether they constitute the side lengths of some right triangle
 * The following two conditions are necessary and sufficient:
 * Each integer must be positive.
 * The sum of the squares of two of the integers must equal the square of the third integer.
 */
import java.lang.Math;
public class RightTriangle {

    public static void main(String[] args) {
	    int a,b,c;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        c=Integer.parseInt(args[3]);
        boolean isItRightTriangle;
        isItRightTriangle= a>0 & b>0 & c>0 & Math.pow(c,2)==Math.pow(a,2)+Math.pow(b,2);
        System.out.println(isItRightTriangle);


    }
}
