package lab8.WithInterface;

public class Main {

    public static void main(String[] args) {

        Cube cube = new Cube(1);
        Sphere sphere = new Sphere(1);
        Parallelepiped parallelepiped = new Parallelepiped(3, 2, 1);

        GeometricBody[] geometricBodies = new GeometricBody[] {cube, sphere, parallelepiped};

        System.out.println("The biggest surface area = " + GeometricBodyController.getBiggestSurface(geometricBodies));
        System.out.println("The biggest volume = " + GeometricBodyController.getBiggestVolume(geometricBodies));

    }

}
