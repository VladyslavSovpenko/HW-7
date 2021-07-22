import Shape.SpatialShape.SpatialShape;
import Shape.StereoShape.Circle;
import Shape.StereoShape.Oval;
import Shape.StereoShape.StereoShape;

import java.awt.*;

public class ShapeHandler {


    public void BiggestStereoShape(StereoShape[] shapes) throws Exception {
        StereoShape temp = shapes[0];


        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof StereoShape) {

            } else throw new Exception("Not Stereo");

            if (shapes[i].Area() >= temp.Area()) {
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

            if (spatialShapes[i].Volume() >= temp.Volume()) {
                temp = spatialShapes[i];
            }
        }
        System.out.println(temp.getType() + " is bigger");

    }


}
