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
public class 문자리스트를문자열로변환하기 {
    public String solution(String[] arr) {
        String answer = "";
        for(int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        return answer;
    }
}
