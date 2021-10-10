package lab1.task1;

public class Task1 {
    public static void main(String[] args) {

        Monitor monitor = new Monitor();
        monitor.name="hp";
        monitor.color="blue";
        monitor.dimension=15;
        monitor.resolution="1400x1050";

        Monitor monitor1 = new Monitor();
        monitor1.name="hp";
        monitor1.color="black";
        monitor1.dimension=14;
        monitor1.resolution="1400x1050";

        System.out.println("Are the monitors similar?: "+monitor.equals(monitor1));

    }
}
