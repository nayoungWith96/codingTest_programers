package nds._20240826;

/**
 * packageName    : nds
 * fileName       : 문자열곱하기
 * author         : ehdtka
 * date           : 2024-08-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-26        ehdtka       최초 생성
 */
public class 문자열곱하기 {

    public static void main(String[] args) {
        String result1 = solution("string",3);
        String result2 = solution("love",10);

        System.out.println(result1);
        System.out.println(result2);
    }

    public static String solution(String my_string, int k) {
        String answer = "";

        if ((my_string.length() >= 1 && my_string.length() <= 100) && (my_string.matches("^[a-z]+$")) && (k >= 1 && k <= 100)) {
            StringBuilder strBulider = new StringBuilder();
            for (int i = 0; k > i; i++) {
                strBulider.append(my_string);
            }
            answer = strBulider.toString();
        } else {
            return "문자 길이 1~100, 영소문자만 가능, 정수 값 1~100 가능";
        }

        return answer;
    }
}

// 다른사람의 코드를 봤을때 my_string.repeat(k); 이런게 있더라
// string을 k번 더하는건가보다