package YNY;

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
public class 문자열섞기 {
    public String solution(String str1, String str2) {
        String answer = "";

        for(int i =0; i < str1.length(); i++){
            answer += String.valueOf(str1.charAt(i)) + str2.charAt(i); // str1과 str2 길이가 같으니 각감 문자열 answer에 저장
        }
        return answer;
    }
}
