package Lab5.P2;

public class TestShape {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("white",10.0,15.0);
        double getAreaTriangle = triangle.getArea();
        System.out.println(getAreaTriangle);
    }

}
