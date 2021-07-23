import shape.spatialshape.SpatialShape;
import shape.stereoshape.StereoShape;

public class ShapeHandler {

  public void BiggestStereoShape(StereoShape[] shapes) {
    StereoShape temp = shapes[0];

    for (int i = 0; i < shapes.length; i++) {

      if (shapes[i].getArea() >= temp.getArea()) {
        temp = shapes[i];
      }
    }
    System.out.println(temp.getType() + " is the biggest");
  }

  public void BiggestSpatialShape(SpatialShape[] spatialShapes) throws Exception {
    SpatialShape temp = spatialShapes[0];

    for (int i = 0; i < spatialShapes.length; i++) {

      if (spatialShapes[i].getVolume() >= temp.getVolume()) {
        temp = spatialShapes[i];
      }
    }
    System.out.println(temp.getType() + " is the biggest");
  }
}
