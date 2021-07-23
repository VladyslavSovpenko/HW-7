import shape.Shape;
import shape.spatialshape.Cylinder;
import shape.spatialshape.Quad;
import shape.spatialshape.SpatialShape;
import shape.spatialshape.Sphere;
import shape.stereoshape.Circle;
import shape.stereoshape.Oval;
import shape.stereoshape.Square;
import shape.stereoshape.StereoShape;

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

        Quad quad1 = new Quad("quad1",3);
        GetNameClass getNameClass = new GetNameClass();
        System.out.println(getNameClass.getNameMethod(quad1));

    }
}

class GetNameClass {
    public String getNameMethod(Shape shape) {
        return "The shape name will be : " + shape.getType();
    }
}
