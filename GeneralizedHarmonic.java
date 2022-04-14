/**
 * Generalized harmonic numbers. Write a program GeneralizedHarmonic.java that takes two integer command-line arguments n and r and uses a for loop to compute the nth generalized harmonic number of order r, which is defined by the following formula:
 * H(n,r)=1/1^r+1/2^r+⋯+1/n^r.
 * For example, H(3,2)=1/1^2+1/2^2+1/3^2=49/36≈1.361111.
 */

import java.lang.Math;
public class GeneralizedHarmonic {
    public static void main(String[] args) {
    int n,r;
     double H=0;
    n= Integer.parseInt(args[0]);
    r= Integer.parseInt(args[1]);
    for(int i=1; i<=n;i++){
        H+=1/(Math.pow(i,r));
    }
        System.out.println(H);
    }
}
