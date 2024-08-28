package YNY._20240828;

/**
 * packageName    : YNY._20240828
 * fileName       : flag에따라다른값반환하기
 * author         : User
 * date           : 2024-08-29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-29        User       최초 생성
 */
public class flag에따라다른값반환하기 {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if(flag == true) {
            return a + b;
        }else {
            return a - b;
        }

    }
}
