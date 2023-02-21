package chapter2.item3;

public class UseSingletonWithPublicStaticFinalField {
    public static final UseSingletonWithPublicStaticFinalField a = new UseSingletonWithPublicStaticFinalField();
    public int b;
    private UseSingletonWithPublicStaticFinalField() {
    }

    public void showParameters() {
        System.out.println("a = " + a);
    }

    public static void main(String[] args) {
        UseSingletonWithPublicStaticFinalField test1 = new UseSingletonWithPublicStaticFinalField();
        UseSingletonWithPublicStaticFinalField test2 = new UseSingletonWithPublicStaticFinalField();
        test1.showParameters();
        test2.showParameters();
    }

}
