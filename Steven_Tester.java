
public class Steven_Tester {
    public static void main (String[]args){
        
        /* RealNumbers only tests
        System.out.println("----------Equals tests----------");
        RealNumber a = new RealNumber(0);
        RealNumber b = new RealNumber (0.00000000001);
        System.out.println("0 case test. Expected false | Output " + a.equals(b));
        RealNumber c = new RealNumber(100000);
        RealNumber d = new RealNumber (99998);
        System.out.println("100,000 and 99,998 case. Expected false | Output " + c.equals(d));

        System.out.println("----------Arithmetic tests----------");
        RealNumber moo = new RealNumber(3934);
        RealNumber boo = new RealNumber(21);
        System.out.println("3934 + 21. Expected 3955.0 | Output " + moo.add(boo));
        System.out.println("3934 - 21. Expected 3913.0 | Output " + moo.subtract(boo));
        System.out.println("3934 * 21. Expected 82614.0 | Output " + moo.multiply(boo));
        System.out.println("3934 + 21. Expected 187.33333333333334 | Output " + moo.divide(boo));
        */

        RationalNumber a = new RationalNumber(3, -5);
        RationalNumber b = new RationalNumber(-6, -10);
        //RationalNumber c = new RationalNumber(394839, 0);
        System.out.println(a.toString());
        System.out.println(b.toString());
        //System.out.println(c.toString());
        System.out.println(RationalNumber.gcd(5,85));
    }
}
