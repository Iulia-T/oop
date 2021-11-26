package lab8.WithAbstract;

public class Parallelepiped extends GeometricBody {

    protected double length, width, height;

    Parallelepiped (double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    double getSurface() {
        return 2 * height * length + 2 * height * width + 2 * width * length;
    }

    @Override
    double getVolume() {
        return length * width * height;
    }

}
