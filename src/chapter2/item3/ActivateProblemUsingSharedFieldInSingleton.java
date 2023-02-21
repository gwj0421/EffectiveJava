package chapter2.item3;

public class ActivateProblemUsingSharedFieldInSingleton {
    private static UsingSharedFieldInSingleton test1 = new UsingSharedFieldInSingleton();
    private static UsingSharedFieldInSingleton test2 = test1;
    public static void main(String[] args) {
        System.out.println("test1.getInstance() = " + test1.getInstance());
        test2.setInstance(4);
        System.out.println("test1.getInstance() = " + test1.getInstance());
    }
}
