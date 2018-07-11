class Rectangle {
    double sideA;
    double sideB;

    Rectangle(double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    double calculateArea (){
        double calc = sideA * sideB;
        return calc;
    }
}
