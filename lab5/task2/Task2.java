package lab5.task2;

public class Task2 {

    public static void main(String[] args) {

        A a = new A("a", "x");
        B b = new B("a", "b", "x");
        C c = new C("a", "b", "c", "x");
        D d = new D("a", "b", "c", "d", "x");
        E e = new E("a", "b", "c", "d", "e", "x");
        F f = new F("a", "b", "c", "d", "e", "f", "x");
        G g = new G("a", "b", "c", "d", "e", "f", "g", "x");
        H h = new H("a", "b", "c", "d", "e", "f", "g", "h", "x");
        I i = new I("a", "b", "c", "d", "e", "f", "g", "h", "i", "x");
        J j = new J("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "x");
        X x = new X("x");

        System.out.println("J: " + j.a + " " + j.b + " " + j.c + " " + j.d + " " + j.e + " " + j.f + " " + j.g + " " + j.h+ " " + j.i + " " + j.j + " " +j.x);
    }

}