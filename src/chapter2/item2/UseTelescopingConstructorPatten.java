package chapter2.item2;

public class UseTelescopingConstructorPatten {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;


    public UseTelescopingConstructorPatten(int a, int b, int c) {
        this(a, b, c, 0, 0);
    }

    public UseTelescopingConstructorPatten(int a, int b) {
        this(a, b, 0, 0, 0);
    }

    public UseTelescopingConstructorPatten(int a, int b, int c, int d, int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    public void showParameters() {
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d + ", e = " + e);
    }

    public static void main(String[] args) {
        UseTelescopingConstructorPatten test1 = new UseTelescopingConstructorPatten(1, 2, 3);
        UseTelescopingConstructorPatten test2 = new UseTelescopingConstructorPatten(1, 3);
        test1.showParameters();
        test2.showParameters();
    }
}
