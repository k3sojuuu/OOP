package lab4.Lab4exe;

public class Circle {
    private boolean circle;
    private String color;

    public boolean isCircle() {
        return circle;
    }

    public void setCircle(boolean circle) {
        this.circle = circle;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getArea(){

    }

    @Override
    public String toString() {
        return "Circle{" +
                "circle=" + circle +
                ", color='" + color + '\'' +
                '}';
    }
}
