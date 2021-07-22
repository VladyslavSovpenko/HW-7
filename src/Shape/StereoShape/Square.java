package Shape.StereoShape;

import Interfaces.GetArea;

public class Square extends StereoShape implements GetArea {

    private double a;

    public Square(String type, double a) {
        super(type);
        this.a = a;

    }

    @Override
    public double Area() {

        return a*a;
    }
}
