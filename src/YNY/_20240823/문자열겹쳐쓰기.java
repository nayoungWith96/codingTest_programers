package YNY._20240823;

/**
 * packageName    : YNY
 * fileName       : 문자리스트를문자열로변환하기
 * author         : User
 * date           : 2024-08-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-24        User       최초 생성
 */
public class 문자열겹쳐쓰기 {
    public String solution(String my_string, String overwrite_string, int s) {

        String answer = my_string.substring(0, s) //// my_string에서 s 이전까지의 문자열을 가져옴
                + overwrite_string
                + my_string.substring(s + overwrite_string.length());// overwrite_string이 덮어쓴 뒤 남아있는 my_string의 뒷부분을 가져옴

        return answer;
    }
}
