package shape.stereoshape;

import interfaces.Area;
import shape.Shape;

public abstract class StereoShape extends Shape implements Area {

  private double R;
  private double r;
  private double a;

  public StereoShape(String type, double a) {
    super(type);
    this.a = a;
  }

  public StereoShape(String type) {
    super(type);
  }

  public StereoShape(String type, double R, double r) {
    super(type);
    this.R = R;
    this.r = r;
  }
}
