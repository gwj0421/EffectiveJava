package chapter2.item3;

public class UsingSharedFieldInSingleton {
    private int a;

    public void setInstance(int a) {
        this.a = a;
    }

    public int getInstance() {
        return a;
    }
}
