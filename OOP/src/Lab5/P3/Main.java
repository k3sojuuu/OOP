package Lab5.P3;

public class Main {
    public static void main(String[] args) {

        MovablePoint movablePoint = new MovablePoint(10.0,5.0);

        System.out.println(movablePoint.moveUp());
        System.out.println(movablePoint.moveDown());
        System.out.println(movablePoint.moveLeft());
        System.out.println(movablePoint.moveRight());
    }
}
