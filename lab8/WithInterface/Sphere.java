package lab8.WithInterface;

public class Sphere implements GeometricBody{

    protected double radius;

    Sphere (double radius) {
        this.radius = radius;
    }

    @Override
    public double getSurface() {
        return 4 * 3.14 * radius * radius;
    }

    @Override
    public double getVolume() {
        return 1.33 * 3.14 * radius * radius * radius;
    }

}
