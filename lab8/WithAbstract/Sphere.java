package lab8.WithAbstract;

public class Sphere extends GeometricBody {

    protected double radius;

    Sphere (double radius) {
        this.radius = radius;
    }

    @Override
    double getSurface() {
        return 4 * 3.14 * radius * radius;
    }

    @Override
    double getVolume() {
        return 1.33 * 3.14 * radius * radius * radius;
    }

}
