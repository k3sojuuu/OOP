package Lab5.P4;

public class MovablePoint implements Movable{

    private int x;
    private int y;
    private int speedX;
    private int speedY;

    public MovablePoint(int x, int y, int speedX, int speedY) {
        this.x = x;
        this.y = y;
        this.speedX = speedX;
        this.speedY = speedY;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSpeedX() {
        return speedX;
    }

    public void setSpeedX(int speedX) {
        this.speedX = speedX;
    }

    public int getSpeedY() {
        return speedY;
    }

    public void setSpeedY(int speedY) {
        this.speedY = speedY;
    }


    @Override
    public String toString() {
        return "MovableCircle{" +
                "x=" + x +
                ", y=" + y +
                ", speedX=" + speedX +
                ", speedY=" + speedY +
                '}';
    }

    @Override
    public void moveUp() {
        x += 1 ;
    }

    @Override
    public void moveDown() {
       x -= 1;
    }

    @Override
    public void moveLeft() {
       y++;
    }

    @Override
    public void moveRight() {
       y--;
    }
}
