package lab5.task3;

public class I extends H{
    protected String i;
    protected X x;
    I (String a, String b, String c, String d, String e, String f, String g, String h, String i, String x) {
        super(a, b, c, d, e, f, g, h, x);
        this.i = i;
        this.x = H.getX();
    }
}
