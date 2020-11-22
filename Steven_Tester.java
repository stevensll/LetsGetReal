public class Steven_Tester {
    public static void main (String[]args){
         
        RealNumber a = new RealNumber(0);
        RealNumber b = new RealNumber (0.00000000001);
        System.out.println("0 case test. Expected false | Output " + a.equals(b));
        RealNumber c = new RealNumber(100000);
        RealNumber d = new RealNumber (99998);
        System.out.println("100,000 and 99,998 case. Expected false | Output " + c.equals(d));
    }
}
