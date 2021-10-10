package lab2.task1;

public class Task1 {

    public static void main(String[] args) {

        Box box1 = new Box();
        Box box2 = new Box(1.5);
        Box box3 = new Box(5.3, 7.1, 2.5);

        int i=0;
        Box[] boxes = new Box[]{box1, box2, box3};

        for (Box box : boxes) {
            i++;
            Area(box, i);
            Volume(box, i);
        }
    }


    static void Area(Box box, int i){
        double area = 2 * (box.height * box.width + box.depth * box.width + box.height* box.depth);
        System.out.println("Area of box " + i + " = " + area);
    }

    static void Volume (Box box, int i){
        double volume = box.height * box.width * box.depth;
        System.out.println("Volume of box " + i + " = " + volume);
    }
}
