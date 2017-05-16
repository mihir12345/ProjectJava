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

    public Complex divide(Complex other) {
        return new Complex(
                this.re / other.re,
                this.im / other.im);
    }

    public Complex minus(Complex other){
        return new Complex
                (this.re-other.re,
                this.im-other.im);
    }


    public Complex  times(Complex other){
        return new Complex
                (this.re*other.re-this.im*other.im,
                        this.im*other.im+this.re*other.re);

    }

    public Complex conjugate(Complex other) {
        return new Complex
                (this.re, -other.im);
    }
    }











