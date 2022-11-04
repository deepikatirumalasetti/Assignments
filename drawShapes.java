package javaprojects;

public class drawShapes {
  public static void main(String[] args) {

    Shape[] shapeList = new Shape[2];
    shapeList[0] = new Rectangle(4.0, 6.0);
    shapeList[1] = new Circle(7.0);
    ShapeUtil.drawShapes(shapeList);
    ShapeUtil.printShapeDetails(shapeList);
  }

}

abstract class Shape {
  private String name;

  public Shape() {

    this.name = "Unknown shape";
  }

  public Shape(String name) {

    this.name = name;
  }

  public String getName() {

    return this.name;
  }

  public void setName(String name) {

    this.name = name;
  }

  public abstract void draw();

  public abstract double getArea();

  public abstract double getPerimeter();
}

class Rectangle extends Shape {
  private double width;

  private double height;

  public Rectangle(double width, double height) {

    super("Rectangle");
    this.width = width;
    this.height = height;
  }

  @Override
  public void draw() {

    System.out.println("Drawing a rectangle...");
  }

  @Override
  public double getArea() {

    return this.width * this.height;
  }

  @Override
  public double getPerimeter() {

    return 2.0 * (this.width + this.height);
  }
}

class Circle extends Shape {
  private double radius;

  public Circle(double radius) {

    super("Circle");
    this.radius = radius;
  }

  @Override
  public void draw() {

    System.out.println("Drawing a circle...");
  }

  @Override
  public double getArea() {

    return Math.PI * this.radius * this.radius;
  }

  @Override
  public double getPerimeter() {

    return 2.0 * Math.PI * this.radius;
  }
}

class ShapeUtil {
  public static void drawShapes(Shape[] list) {

    for (int i = 0; i < list.length; i++) {

      list[i].draw();
    }
  }

  public static void printShapeDetails(Shape[] list) {

    for (int i = 0; i < list.length; i++) {

      String name = list[i].getName();
      double area = list[i].getArea();
      double perimeter = list[i].getPerimeter();
      System.out.println("Name: " + name);
      System.out.println("Area: " + area);
      System.out.println("Perimeter: " + perimeter);
    }
  }
}