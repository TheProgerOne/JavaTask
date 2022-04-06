/**
 * 1.2.34 Three-sort.
 * Write a program that takes three integer command-line arguments and prints them in ascending order.
 * Use Math.min() and Math.max().
 */
import java.lang.Math;
class ThreeSort {

    public static void main(String[] args) {
        int one = Integer.parseInt(args[0]);
        int two = Integer.parseInt(args[1]);
        int three = Integer.parseInt(args[2]);
        int max1=Math.max(one,two);
        int theLargest=Math.max(max1,three);
        System.out.println("The largest number is "+theLargest);
        int min1=Math.min(one,two);
        int theSmallest=Math.min(min1,three);
        System.out.println("The smallest number is "+theSmallest);
    }
}
