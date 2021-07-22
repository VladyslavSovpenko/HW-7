package Shape.SpatialShape;

import Interfaces.GetVolume;

public class Cylinder extends SpatialShape implements GetVolume {
    private double R;
    private double h;

    public Cylinder(String type, double R, double h) {
        super(type);
        this.R = this.R;
        this.h = this.h;
    }

    @Override
    public double Volume() {
        return Pi*R*R*h;

    }
}
