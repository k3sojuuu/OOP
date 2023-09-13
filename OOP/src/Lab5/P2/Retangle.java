package Lab5.P2;

public class Retangle extends Shape{

private double height;
private double width;

    public Retangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Retangle(String color) {
        super(color);
    }

    @Override
    public double getArea() {
        return width*height;
    }
}
