/**
 * Created by mihir on 08-05-2017.
 */
public class Complex {

    public final double re;

    public final double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public Complex(double re) {
        this(re, 0);
    }

    public Complex sub(Complex other) {
        return new Complex(
                this.re - other.re,
                this.im - other.im);
    }

}

