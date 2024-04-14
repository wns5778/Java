package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils(){
        //private 인스턴스 생성을 막는다.
    }

    static int sum(int[] a){
        int sum = 0;
        for (int i=0;i<a.length;i++) {
            sum+=a[i];
        }
        return sum;
    }

    static double average(int[] a){
        return (double) sum(a) / a.length;
    }

    static int min(int[] a){
        int min = a[0];
        for (int i=0;i<a.length;i++) {
            if (a[i] < min)
                min = a[i];
        }
        return min;
    }

    static int max(int[] a){
        int max = a[0];
        for (int i=0;i<a.length;i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }
}
