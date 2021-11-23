package lab5.task1;

public class Task1 {

    public static void main(String[] args) {

        A a = new A("a");
        B b = new B("a", "b");
        C c = new C("a", "b", "c");
        D d = new D("a", "b", "c", "d");
        E e = new E("a", "b", "c", "d", "e");
        F f = new F("a", "b", "c", "d", "e", "f");
        G g = new G("a", "b", "c", "d", "e", "f", "g");
        H h = new H("a", "b", "c", "d", "e", "f", "g", "h");
        I i = new I("a", "b", "c", "d", "e", "f", "g", "h", "i");
        J j = new J("a", "b", "c", "d", "e", "f", "g", "h", "i", "j");

        System.out.println("A: " + a.a);
        System.out.println("B: " + b.a + " " + b.b);
        System.out.println("C: " + c.a + " " + c.b + " " + c.c);
        System.out.println("D: " + d.a + " " + d.b + " " + d.c+" " + d.d);
        System.out.println("E: " + e.a + " " + e.b + " " + e.c + " " + e.d + " " + e.e);
        System.out.println("F: " + f.a + " " + f.b + " " + f.c + " " + f.d + " " + f.e + " " + f.f);
        System.out.println("G: " + g.a + " " + g.b + " " + g.c + " " + g.d + " " + g.e + " " + g.f + " " + g.g);
        System.out.println("H: " + h.a + " " + h.b + " " + h.c + " " + h.d + " " + h.e + " " + h.f + " " + h.g + " " + h.h);
        System.out.println("I: " + i.a + " " + i.b + " " + i.c + " " + i.d + " " + i.e + " " + i.f + " " + i.g + " " + i.h+ " " + i.i);
        System.out.println("J: " + j.a + " " + j.b + " " + j.c + " " + j.d + " " + j.e + " " + j.f + " " + j.g + " " + j.h+ " " + j.i + " " + j.j);

    }

}


