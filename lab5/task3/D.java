package lab5.task3;

public class D extends C{
    protected String d;
    protected X x = new X("xd");
    D (String a, String b, String c, String d, String x) {
        super(a, b, c, d);
        this.d = d;
        x = this.x.toString();

    }
}
