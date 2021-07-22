package Shape.SpatialShape;

import Interfaces.GetVolume;

public class Sphere extends SpatialShape implements GetVolume {
    private double R;

    public Sphere(String type, double R) {
        super(type);
        this.R=R;
    }

    @Override
    public double Volume() {
        return 4/3*Pi*R*R*R;

    }
}
