package shape.spatialshape;
import interfaces.Volume;
import shape.Constant;

public class Cylinder extends SpatialShape implements Volume {
    private double R;
    private double h;

    public Cylinder(String type, double R, double h) {
        super(type);
        this.R = this.R;
        this.h = this.h;
    }

    @Override
    public double getVolume() {
        Constant constant= new Constant();
        return constant.Pi *R*R*h;
    }
}
