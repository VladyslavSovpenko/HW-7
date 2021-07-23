import shape.spatialshape.SpatialShape;
import shape.stereoshape.StereoShape;

public class ShapeHandler {

    public void BiggestStereoShape(StereoShape[] shapes) throws Exception {
        StereoShape temp = shapes[0];

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof StereoShape) {

            } else throw new Exception("Not Stereo");

            if (shapes[i].getArea() >= temp.getArea()) {
                temp = shapes[i];
            }
        }
        System.out.println(temp.getType() + " is bigger");
    }

    public void BiggestSpatialShape(SpatialShape[] spatialShapes) throws Exception {
        SpatialShape temp = spatialShapes[0];

        for (int i = 0; i < spatialShapes.length; i++) {
            if (spatialShapes[i] instanceof SpatialShape) {

            } else throw new Exception("Not Spatial");

            if (spatialShapes[i].getVolume() >= temp.getVolume()) {
                temp = spatialShapes[i];
            }
        }
        System.out.println(temp.getType() + " is bigger");
    }
}
