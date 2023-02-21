package chapter2.item2;

public class UseJavaBeans {
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int e = 0;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setD(int d) {
        this.d = d;
    }

    public void setE(int e) {
        this.e = e;
    }

    public UseJavaBeans() {
    }

    public void showParameters() {
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d + ", e = " + e);

    }

    public static void main(String[] args) {
        UseJavaBeans test1 = new UseJavaBeans();
        test1.setA(40);
        test1.setB(50);
        test1.showParameters();
    }
}
