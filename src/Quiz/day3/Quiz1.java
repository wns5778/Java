package Quiz.day3;

//정수가 담긴 리스트 num_list가 주어질 때,
//모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.

public class Quiz1 {
    public static int solution(int[] num_list) {
        int answer = 0;
        int a=0;
        int b=1;

        for (int i=0;i<num_list.length;i++){
            a+=num_list[i];
            b*=num_list[i];
        }

        if ((int)Math.pow(a,2) > b)
            answer = 1;
        else
            answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {3,4,5,2,1};
        int[] arr2 = {5,7,8,3};
        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
    }
}
