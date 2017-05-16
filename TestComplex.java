/**
 * Created by mihir on 08-05-2017.
 */
public class TestComplex {

    public static void main(String[] args) {
        Complex a = new Complex(1, 3);
        Complex b = new Complex(3, 4);
        Complex c = a.divide(b);
        Complex d = a.minus(b);
        Complex e = a.times(b);
        Complex f = a.conjugate(b);

        System.out.println();
        System.out.println("Divide complex number");
        System.out.println(c.re);
        System.out.println(c.im);

        System.out.println();
        System.out.println("minus complex number");
        System.out.println(d.re);
        System.out.println(d.im);

        System.out.println();
        System.out.println("times complex number");
        System.out.println(e.re);
        System.out.println(e.im);


        System.out.println();
        System.out.println("conjugate complex number ");
        System.out.println(f.re);
        System.out.println(f.im);







    }
}


