package lab8.WithAbstract;

public class Cube extends GeometricBody {

    protected double side;

    Cube (double side) {
        this.side = side;
    }

    @Override
    double getSurface() {
        return 6 * side * side;
    }

    @Override
    double getVolume() {
        return side * side * side;
    }

}
