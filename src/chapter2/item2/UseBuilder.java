package chapter2.item2;

public class UseBuilder {
    private int a;
    private int b;
    private int c = 0;
    private int d = 0;
    private int e = 0;

    public UseBuilder setC(int c) {
        this.c = c;
        return this;
    }

    public UseBuilder setD(int d) {
        this.d = d;
        return this;
    }

    public UseBuilder setE(int e) {
        this.e = e;
        return this;
    }

    public UseBuilder(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void showParameters() {
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d + ", e = " + e);
    }

    public static void main(String[] args) {
        UseBuilder test1 = new UseBuilder(1, 2).setC(3).setD(4).setE(5);
        test1.showParameters();
    }
}
