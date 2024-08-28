package YNY._20240826;

/**
 * packageName    : YNY._20240826
 * fileName       : 문자열곱하
 * author         : User
 * date           : 2024-08-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-28        User       최초 생성
 */
public class 문자열곱하기 {
    public String solution(String my_string, int k) {
        String answer = "";

        for(int i = 0; i<k; i++){
            System.out.print(my_string);
            answer += my_string; //결과를 answer에 저장..
        }

        return answer;
    }
}
