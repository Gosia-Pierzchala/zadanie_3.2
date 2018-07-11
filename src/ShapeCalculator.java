public class ShapeCalculator {

    double squareArea(Square square){
        double squareA = square.sideA * square.sideA;
        return squareA;
    }

    double circleArea(Circle cirle){
        double circleA = 3.14 * cirle.radius * cirle.radius;
        return circleA;
    }

    double trianglePerimeter(Triangle triangle){
        double triangleP = triangle.sideA + triangle.sideB + triangle.sideC;
        return triangleP;
    }

    double rectPerimeter(Rectangle rectangle){
        double rectP = rectangle.sideA + rectangle.sideA + rectangle.sideB + rectangle.sideB;
        return rectP;
    }
}
