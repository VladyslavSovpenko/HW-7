package shape.stereoshape;

import interfaces.Area;

public class Square extends StereoShape implements Area {

  private double a;

  public Square(String type, double a) {
    super(type);
    this.a = a;
  }

  @Override
  public double getArea() {
    return a * a;
  }
}
