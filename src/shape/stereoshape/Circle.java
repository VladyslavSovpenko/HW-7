package shape.stereoshape;

import interfaces.Area;
import shape.Constant;

public class Circle extends StereoShape implements Area {

  private int R;

  public Circle(String type, int R) {
    super(type);
    this.R = R;
  }

  @Override
  public double getArea() {
    Constant constant = new Constant();
    return R * R * constant.PI;
  }
}
