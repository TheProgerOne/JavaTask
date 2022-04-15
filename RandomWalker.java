/**
 * Write a program RandomWalker.java that takes an integer command-line argument r
 * and simulates the motion of a random walk until the random walker is at Manhattan distance r
 * from the starting point. Print the coordinates at each step of the walk
 * (including the starting and ending points), treating the starting point as (0, 0).
 * Also, print the total number of steps taken.
 */
import java.lang.Math;
public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int md = x + y;
        int steps = 0;
        double random = Math.random();
        System.out.print("(" + x + ", " + y + ")\n");
        while (md != r){
            random=Math.random();
            // right
            if (random < 0.25) x++;
            // left
            else if (random < 0.5) x--;
            // up
            else if (random < 0.75) y++;
            // down
            else if (random < 1.00) y--;

            md = Math.abs(x) + Math.abs(y);
            steps++;
            System.out.println("(" + x + ", " + y + ")");
        }
        System.out.println("steps = " + steps);
    }
}
