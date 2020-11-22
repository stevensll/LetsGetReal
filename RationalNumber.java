public class RationalNumber extends RealNumber{
    private int numerator, denominator;

    public RationalNumber(int nume, int deno){
        super(0.0);
        numerator = nume;
        denominator = deno;
        if (deno == 0) {numerator = 0; denominator = 1;}
        else if (nume > 0 && deno < 0){
            numerator *= -1; 
            denominator *= -1;
            reduce();
        }
        else if (nume < 0 && deno < 0){
            numerator *= -1; 
            denominator *=-1;
            reduce();
        }
    }

    public static int gcd(int a, int b){
        int divisor = Math.abs(Math.max(a,b));
        int dividend = Math.abs(Math.min(a,b));
        // assume the dividend is gcd. the loop will take care of it if that is not the case
        int gcd = dividend;
        // if there's a remainder, find a gcd smaller than the dividend. end right before
        // the reaminder turns to 0.
        while (divisor % dividend != 0){
            int rem = divisor % dividend;
            divisor = dividend;
            dividend = rem;
            gcd = rem;
        }
        return gcd;
    }

    private void reduce(){
        int gcd = gcd(numerator,denominator);
        numerator /=gcd;
        denominator /=gcd;
    }

    public double getValue(){
        return 0.0;
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public String toString(){
        return numerator+"/"+denominator;
    }

     
}
