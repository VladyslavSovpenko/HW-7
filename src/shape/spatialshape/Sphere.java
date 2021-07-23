package shape.spatialshape;

import interfaces.Volume;
import shape.Constant;

public class Sphere extends SpatialShape implements Volume {
    private double R;

    public Sphere(String type, double R) {
        super(type);
        this.R=R;
    }

    @Override
    public double getVolume() {
        Constant constant= new Constant();
        return 4/3*constant.Pi*R*R*R;
    }
}
