package lab8.WithInterface;

public class Parallelepiped implements GeometricBody{

    protected double length, width, height;

    Parallelepiped (double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getSurface() {
        return 2 * height * length + 2 * height * width + 2 * width * length;
    }

    @Override
    public double getVolume() {
        return length * width * height;
    }

}
