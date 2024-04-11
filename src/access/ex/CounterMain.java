package access.ex;

public class CounterMain {
    public static void main(String[] args) {
        MaxCounter countr = new MaxCounter(3);
        countr.increment();
        countr.increment();
        countr.increment();
        countr.increment();
        int count = countr.getCount();
        System.out.println(count);
    }
}
