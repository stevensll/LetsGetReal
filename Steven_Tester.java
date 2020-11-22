
public class Steven_Tester {
    public static void main (String[]args){
        
        /* RealNumber only tests
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

        // RationalNumber only tests
        System.out.println("----------Constructor tests----------");
        RationalNumber a = new RationalNumber(3, -5);
        RationalNumber b = new RationalNumber(-6, -10);
        RationalNumber c = new RationalNumber(394839, 0);
        RationalNumber d = new RationalNumber(0, 35);
        RationalNumber e = new RationalNumber(0, 0);
        RationalNumber f = new RationalNumber(100, 100);
        RationalNumber g = new RationalNumber(39, 156);
        System.out.println("Init : 3/-5. Expected -3/5 | Output " + a.toString());
        System.out.println("Init : -6/-10. Expected 3/5 | Output " + b.toString());
        System.out.println("Init : 394839/0. Expected 0/1 | Output " + c.toString());
        System.out.println("Init : 0/-35. Expected 0/1 | Output " + d.toString());
        System.out.println("Init : 0/0. Expected 0/1 | Output " + e.toString());
        System.out.println("Init : 100/100. Expected 1/1 | Output " + f.toString());
        System.out.println("Init : 39/156. Expected 1/4 | Output " + g.toString());

        RationalNumber moo = new RationalNumber(-10,-20);
        RationalNumber boo = new RationalNumber(40,80);
        System.out.println("Comparing -10/-20 to 40/80. Expected true | Output " + moo.equals(boo));
    }
}
