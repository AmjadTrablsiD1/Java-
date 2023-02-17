package Geom;

// import jave.lang.Math;
// import java.Math;

public class Quader {

    private double lange;
    private double breit;
    private double hoch;

    public Quader(double l, double b, double h) {

        this.lange = l;
        this.breit = b;
        this.hoch = h;

    }

    public double volumen() {
        return lange * breit * hoch;

    }

    public double mantel() {
        return 2 * ((lange * hoch) + (breit * hoch));
    }

    public double ober() {
        return mantel() + (2 * lange * breit);
    }

    public double lang() {
        return Math.sqrt(lange * lange + breit * breit + hoch * hoch);
    }

}
