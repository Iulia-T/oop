package lab2.task1;

public class Box {

    double height, width, depth;

    Box(){
        this.height = 1;
        this.width = 1;
        this.depth = 1;
    }

    Box(double height){
        this.height = height;
        this.width = height;
        this.depth = height;
    }

    Box(double height, double width, double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
}
