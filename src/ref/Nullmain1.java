package ref;

public class Nullmain1 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; // NullPointerException 예외 발생
        System.out.println("data = " + data.value);
    }
}
