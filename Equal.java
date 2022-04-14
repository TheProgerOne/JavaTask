/**
 *write a program that takes three integer command-line
 * arguments and prints equal if all three are equal and not
 * equal otherwise
 */

import java.util.Scanner;
public class Equal {
    public static void main(String[] args) {
     int a,b,c;
     Scanner scanner= new Scanner(System.in);
     a=scanner.nextInt();
     b= scanner.nextInt();
     c= scanner.nextInt();
     if(a == b && b == c && c==a) System.out.println("equal");
     else System.out.println("mot equal");

    }
}
