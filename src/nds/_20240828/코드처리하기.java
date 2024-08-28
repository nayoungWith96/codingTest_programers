package nds._20240828;

/**
 * packageName    : nds._20240828
 * fileName       : 코드처리하기
 * author         : ehdtka
 * date           : 2024-08-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-28        ehdtka       최초 생성
 */
public class 코드처리하기 {

    public static void main(String[] args) {
        System.out.println(solution("abc1abc1abc"));
    }

    public static String solution(String code) {
        String answer = "";

        if ((code.length() <= 100000) && (code.matches("^[a-z1 ]+$"))) {

            String[] arr = code.split("",-1);
            int mode = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals("1")) {
                    mode = mode == 0 ? 1 : 0;

                } else {
                    if (mode == 0) {
                        if (i % 2 == 0) {
                            answer += arr[i];
                        }
                    } else {
                        if (i % 2 != 0) {
                            answer += arr[i];
                        }
                    }
                }
            }

        } else {
            answer = "소문자와 1만 들어갑니다.";
        }

        return answer.length() == 0 ? "EMPTY" : answer;
    }
}
