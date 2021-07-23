package shape.spatialshape;

import interfaces.Volume;

public class Quad extends SpatialShape implements Volume {

  private double a;

  public Quad(String type, double a) {
    super(type);
    this.a = a;
  }

  @Override
  public double getVolume() {
    return a * a * a;
  }
}
