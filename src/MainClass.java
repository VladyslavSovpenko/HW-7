import Shape.SpatialShape.Cylinder;
import Shape.SpatialShape.Quad;
import Shape.SpatialShape.SpatialShape;
import Shape.SpatialShape.Sphere;
import Shape.StereoShape.Circle;
import Shape.StereoShape.Oval;
import Shape.StereoShape.Square;
import Shape.StereoShape.StereoShape;

import java.awt.*;

public class MainClass {


    public static void main(String[] args) throws Exception {
        ShapeHandler shapeHandler = new ShapeHandler();
        StereoShape circle = new Circle("Circle", 1);
        StereoShape oval = new Oval("Oval", 8, 4);
        StereoShape square = new Square("Square", 20);

        StereoShape[] stereoShapes = new StereoShape[]{circle, oval, square};

        SpatialShape quad = new Quad("Quad", 100);
        SpatialShape cylinder = new Cylinder("cylinder", 8, 8);
        SpatialShape sphere = new Sphere("Sphere", 8);

        SpatialShape[] spatialShapes = new SpatialShape[]{quad, sphere, cylinder};

        shapeHandler.BiggestStereoShape(stereoShapes);
        shapeHandler.BiggestSpatialShape(spatialShapes);

        Oval oval1 = new Oval("oval1", 1, 3);
        GetNameClass getNameClass = new GetNameClass();
        System.out.println(getNameClass.getNameMethod(oval1));

    }
}

class GetNameClass {
    public String getNameMethod(StereoShape shape) {
        return "The shape name will be : " + shape.getType();
    }
}
