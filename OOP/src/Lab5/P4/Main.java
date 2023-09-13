package Lab5.P4;

public class Main {
    public static void main(String[] args) {
        MovableCircle movableCircle = new MovableCircle(10,5,3,4,7);
        movableCircle.moveDown();
        System.out.println(movableCircle.getCenter().getY());
    }
}
