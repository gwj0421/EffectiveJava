package chapter2.item1;

public class userConstructer {
    private int item;

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public userConstructer(int item) {
        this.item = item;
    }

    public static void main(String[] args) {
        userConstructer item = new userConstructer(2);
        System.out.println(item.getItem());
    }
}
