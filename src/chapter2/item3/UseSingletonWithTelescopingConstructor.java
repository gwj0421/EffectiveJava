package chapter2.item3;

public class UseSingletonWithTelescopingConstructor {
    public static final UseSingletonWithTelescopingConstructor INSTANCE = new UseSingletonWithTelescopingConstructor();
    public int b;   // 공유 필드 문제를 확인하기 위한 매개변수
    private UseSingletonWithTelescopingConstructor() {
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public UseSingletonWithTelescopingConstructor getItem() {
        return INSTANCE;
    }

    public void showParameters() {
        System.out.println("INSTANCE = " + INSTANCE);
    }


}
