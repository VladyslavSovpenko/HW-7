package shape.stereoshape;

import interfaces.Area;
import shape.Constant;

public class Oval extends StereoShape implements Area {

    private double R;
    private double r;

    public Oval(String type, double R,double r) {
        super(type);
        this.R = R;
        this.r =r;
    }

    @Override
    public double getArea() {
        Constant constant= new Constant();
        return constant.Pi*R*r;
    }
}
