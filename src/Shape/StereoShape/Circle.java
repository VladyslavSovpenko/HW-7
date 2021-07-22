package Shape.StereoShape;

import Interfaces.GetArea;

public class Circle extends StereoShape implements GetArea {
    private int R;

    public Circle(String type, int R) {
        super(type);
        this.R = R;
    }

    @Override
    public double Area() {

        return R * R * Pi;
    }
}
