package Shape.SpatialShape;

import Interfaces.GetVolume;
import Shape.Shape;

public class SpatialShape extends Shape implements GetVolume {

    public SpatialShape(String type) {
        super(type);
    }


    @Override
    public double Volume() {
        return 0;
    }
}
