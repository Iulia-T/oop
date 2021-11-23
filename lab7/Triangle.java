package lab7;

import static java.lang.Math.sqrt;

public class Triangle extends Figure{

    protected double side1;
    protected double side2;
    protected double side3;

    Triangle (double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    @Override
    double getPerimeter(){
        return side1 + side2 + side3;
    }

    @Override
    double getArea(){
        double s;
        s = (side1 + side2 + side3)/2;
        return sqrt(s * (s-side1) * (s-side2) * (s-side3));
    }

}
