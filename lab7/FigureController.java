package lab7;

import lab1.task2.Student;
import lab1.task2.University;

public class FigureController {

    static double getBiggestPerimeter(Figure[] figures){

        double biggestPerimeter = 0;
        for (Figure figure : figures){
            if (figure.getPerimeter() > biggestPerimeter) biggestPerimeter = figure.getPerimeter();
        }

        return biggestPerimeter;
    }

    static double getBiggestArea(Figure[] figures){

        double biggestArea = 0;
        for (Figure figure : figures){
            if (figure.getArea() > biggestArea) biggestArea = figure.getArea();
        }

        return biggestArea;
    }

}



