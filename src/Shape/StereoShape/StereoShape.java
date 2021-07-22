package Shape.StereoShape;

import Interfaces.GetArea;
import Shape.Shape;

import java.awt.geom.Area;

public class StereoShape extends Shape implements GetArea {
    private double R;
    private double r;
    private double a;

    public StereoShape(String type, double a) {
        super(type);
        this.a = a;
    }
    public StereoShape(String type) {
        super(type);
    }

    public StereoShape(String type, double R,double r){
        super(type);
        this.R = R;
        this.r = r;

    }


    @Override
    public double Area() {
        return 0;
    }
}
