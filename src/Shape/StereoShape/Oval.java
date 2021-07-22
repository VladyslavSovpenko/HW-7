package Shape.StereoShape;

import Interfaces.GetArea;

public class Oval extends StereoShape implements GetArea {

    private double R;
    private double r;

    public Oval(String type, double R,double r) {
        super(type);
        this.R = R;
        this.r =r;


    }

    @Override
    public double Area() {
        return Pi*R*r;

    }
}
