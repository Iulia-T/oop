package lab7;

public class Square extends Figure{

    protected double side;

    Square (double side) {
        this.side = side;
    }

    @Override
    double getPerimeter(){
        return 4 * side;
    }

    @Override
    double getArea(){
        return side * side;
    }

}
