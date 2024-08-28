package YNY._20240826;

/**
 * packageName    : YNY._20240826
 * fileName       : 두수의연산값비교하
 * author         : User
 * date           : 2024-08-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-28        User       최초 생성
 */
public class 두수의연산값비교하기 {
    public int solution(int a, int b) {

        int answer = Integer.parseInt(Integer.toString(a) + Integer.toString(b));

        int answer2 = 2 * a * b;


        return Math.max(answer, answer2);
    }
}
