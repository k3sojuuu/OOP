package Lab5.P3;

public class MovablePoint implements Movable{
    private double x;
    private double y;



    public MovablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public double moveUp() {
        y++;
        return y;
    }

    @Override
    public double moveDown() {

        y--;
        return y;
    }

    @Override
    public double moveLeft() {
     x--;
        return x;
    }

    @Override
    public double moveRight() {

        x++;return x;
    }
}
