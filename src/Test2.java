public class Test2 {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(5, 10);
        double rectArea = rect.calculateArea();
        System.out.println(rectArea);

        Square squ = new Square(3.3);
        double squArea = squ.calculateArea();
        System.out.println(squArea);

        Circle circ = new Circle (4);
        double circArea = circ.caclculateArea();
        System.out.println(circArea);

        Triangle tri = new Triangle(1,2,3);
        double triPer = tri.calculatePer();
        System.out.println(triPer);
    }
}
