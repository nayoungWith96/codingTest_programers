package YNY._20240827;

/**
 * packageName    : YNY._20240827
 * fileName       : 홀짝에따라다른값반환하기
 * author         : User
 * date           : 2024-08-29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-29        User       최초 생성
 */
public class 홀짝에따라다른값반환하기 {
    public int solution(int n) {
        int answer = 0;
        if( n % 2 == 1){
            for(int i = 1; i <= n; i+=2){ //홀수
                answer += i;
            }
        }else{
            for(int i = 2; i <= n; i+=2){ //짝수
                answer += i*i;

            }

        }
        return answer;
    }
}
