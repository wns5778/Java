package Quiz.day3;

//정수가 담긴 리스트 num_list가 주어집니다.
// num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.


public class Quiz2 {
    public int solution(int[] num_list) {
        int answer = 0;
        String evensum = "";
        String oddsum = "";
        for (int i=0;i<num_list.length;i++){
            if (num_list[i]%2==0)
                evensum += num_list[i];
            else
                oddsum += num_list[i];
        }
        answer = Integer.parseInt(evensum)+Integer.parseInt(oddsum);
        return answer;
    }
}
