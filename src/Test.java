public class Test {
    public static void main(String[] args) {

        Square square1 = new Square(4.1);
        ShapeCalculator shapeCalculator = new ShapeCalculator();

        double resultS = shapeCalculator.squareArea(square1);
        System.out.println(resultS);

        Rectangle rectangle1 = new Rectangle(2.1,3.8);
        double resultR = shapeCalculator.rectPerimeter(rectangle1);
        System.out.println(resultR);

        Circle circle1 = new Circle(2.4);
        double resultC = shapeCalculator.circleArea(circle1);
        System.out.println(resultC);

        Triangle triangle1 = new Triangle(2.2, 1.11, 3.4);
        double resultT = shapeCalculator.trianglePerimeter(triangle1);
        System.out.println(resultT);

    }
}
