package Quiz.day1;


//정수 number와 n, m이 주어집니다. number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.
public class Quiz1 {
    public static int solution(int num, int n, int m) {
        int answer = 0;

        if(num%n==0 && num%m==0)
            answer = 1;
        else
            answer = 0;

        return answer;
    }


    public static void main(String[] args) {

        System.out.println(solution(60,2,3));
        System.out.println(solution(55,10,5));

    }
}

