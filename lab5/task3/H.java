package lab5.task3;

public class H extends G {
    protected String h;
    private static X x = new X("xdd");

    H (String a, String b, String c, String d, String e, String f, String g, String h, String x) {
        super(a, b, c, d, e, f, g, x);
        this.h = h;
       // this.setX(getX());

       // x = H.getX().toString();
    }

   // public void setX(X x) {
     //   this.x = x;
    //}

    public static X getX() {
        return x;
    }


}


