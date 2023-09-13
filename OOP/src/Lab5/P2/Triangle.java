package Lab5.P2;

public class Triangle extends Shape {
     private double base;
     private double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Triangle(String color) {
        super(color);
    }

    @Override
    public double getArea() {
        return 0.5*base*height;
    }

}
