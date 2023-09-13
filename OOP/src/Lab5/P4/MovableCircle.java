package Lab5.P4;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int radius, int x, int y, int speedX, int speedY) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, speedX, speedY);
    }



    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MovablePoint getCenter() {
        return center;
    }

    public void setCenter(MovablePoint center) {
        this.center = center;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
