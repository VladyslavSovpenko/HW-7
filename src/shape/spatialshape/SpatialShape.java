package shape.spatialshape;

import interfaces.Volume;
import shape.Shape;

public abstract class SpatialShape extends Shape implements Volume {

    public SpatialShape(String type) {
        super(type);
    }
}
