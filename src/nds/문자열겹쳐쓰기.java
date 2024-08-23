package nds;

import java.util.Scanner;

/**
 * packageName    : nds
 * fileName       : 문자열겹쳐쓰기
 * author         : ehdtka
 * date           : 2024-08-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-23        ehdtka       최초 생성
 */
public class 문자열겹쳐쓰기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.nextLine();
        String overwrite_string = sc.nextLine();
        int s = sc.nextInt();
        String result = solution(my_string, overwrite_string, s);
        System.out.printf(result);
    }

    public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        if (!my_string.matches("^[a-zA-Z0-9]+$") || !overwrite_string.matches("^[a-zA-Z0-9]+$")) {
            return "숫자와 알파벳만 입력 가능합니다.";
        } else if (overwrite_string.length() > my_string.length()) {
            return "합쳐야 할 문자가 대상 문자열 보다 깁니다.";
        } else if (my_string.length() > 1000) {
            return "대상 문자의 길이는 1001을 넘을 수 없습니다.";
        } else {
            answer = my_string.substring(0,s) + overwrite_string + my_string.substring(overwrite_string.length()+s);
            return answer;
        }
    }

}
