package chapter2.item1;

public class useStaticFactoryMethod {
    private final int item;

    public static useStaticFactoryMethod of(int num) {
        return new useStaticFactoryMethod(num);
    }

    public useStaticFactoryMethod(int item) {
        this.item = item;
    }

    public int getItem() {
        return item;
    }

    public static void main(String[] args) {
        useStaticFactoryMethod testA = new useStaticFactoryMethod(40);
        System.out.println(testA.getItem());
    }
}
