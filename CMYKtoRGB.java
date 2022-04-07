/**
 *  Type conversion. Several formats are used to represent color.
 *  For example, the primary format for LCD displays, digital cameras,
 *  and web pages—known as the RGB format—specifies the level of red (R),
 *  green (G), and blue (B) on an integer scale from 0 to 255.
 *  The primary format for publishing books and magazines—known
 *  as the CMYK format—specifies the level of cyan (C), magenta (M), yellow (Y),
 *  and black (K) on a real scale from 0.0 to 1.0.
 *  Write a program CMYKtoRGB.java that converts from CMYK format to RGB format using these mathematical formulas:
 *  white=1−black
 *  red=255×white×(1−cyan)
 *  green=255×white×(1−magenta)
 *  blue=255×white×(1−yellow)
 */
public class CMYKtoRGB {

    public static void main(String[] args) {
        double cyan, magenta, yellow, black;
        cyan= Double.parseDouble(args[0]);
        magenta=Double.parseDouble(args[1]);
        yellow=Double.parseDouble(args[2]);
        black=Double.parseDouble(args[3]);
        double white=1-black;
        double red= 255*white*(1-cyan);
        double green=255*white*(1-magenta);
        double blue=255*white*(1-yellow);
        System.out.println("red   = "+Math.round(red));
        System.out.println("green = "+Math.round(green));
        System.out.println("blue  = "+Math.round(blue));
    }
}
