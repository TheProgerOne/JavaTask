/**
 * Write a program BandMatrix.java that takes two integer command-line arguments n and width and prints
 * an n-by-n pattern like the ones below, with a zero (0) for each element whose distance from the main diagonal
 * is strictly more than width, and an asterisk (*) for each entry that is not,
 * and two spaces between each 0 or *.
 */
import java.lang.Math;
public class BandMatrix {
    public static void main(String[] args) {
        int n= Integer.parseInt(args[0]);
        int width=Integer.parseInt(args[1]);
        for (int line = 0; line < n; line++) {
            for (int raw = 0; raw < n; raw++) {
                if (Math.abs(line - raw) <= width) {
                    System.out.print("*  ");
                } else System.out.print("0  ");
            }
            System.out.println();
        }
    }
}
