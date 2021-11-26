package lab8.WithInterface;

public class Cube implements GeometricBody{

    protected double side;

    Cube (double side) {
        this.side = side;
    }

    @Override
    public double getSurface() {
        return 6 * side * side;
    }

    @Override
    public double getVolume() {
        return side * side * side;
    }

}
