package lab7;

public class Rectangle extends Figure{

    protected double length;
    protected double width;

    Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getPerimeter(){
        return 2 * (length + width);
    }

    @Override
    double getArea(){
        return length * width;
    }

}
