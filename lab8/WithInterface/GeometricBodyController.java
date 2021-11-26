package lab8.WithInterface;

public class GeometricBodyController {

    public static double getBiggestSurface  (GeometricBody[] geometricBodies){

        double biggestSurface = 0;
        for (GeometricBody geometricBody : geometricBodies){
            if (geometricBody.getSurface() > biggestSurface) biggestSurface = geometricBody.getSurface();
        }

        return biggestSurface;
    }

    static double getBiggestVolume (GeometricBody[] geometricBodies){

        double biggestVolume = 0;
        for (GeometricBody geometricBody : geometricBodies){
            if (geometricBody.getVolume() > biggestVolume) biggestVolume = geometricBody.getVolume();
        }

        return biggestVolume;
    }

}
