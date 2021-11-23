package lab7;

public class Main {

    public static void main(String[] args) {

        Square square = new Square(2);
        Rectangle rectangle = new Rectangle(4,3);
        Triangle triangle  = new Triangle(3, 4, 5);

        Figure[] figures = new Figure[] {square, rectangle, triangle};

        System.out.println("The biggest perimeter before circle = " + FigureController.getBiggestPerimeter(figures));
        System.out.println("The biggest area before circle = " + FigureController.getBiggestArea(figures));

        Figure circle = new Figure() {
            double radius = 2;

            @Override
            double getPerimeter() {
                return 2 * 3.14 * radius;
            }

            @Override
            double getArea() {
                return 3.14 * radius *radius;
            }
        };

        Figure[] figures1 = new Figure[] {square, rectangle, triangle, circle};

        System.out.println("The biggest perimeter after adding circle is = " + FigureController.getBiggestPerimeter(figures1));
        System.out.println("The biggest area after adding circle is = " + FigureController.getBiggestArea(figures1));

    }

}
