package nds;

import java.util.Scanner;

/**
 * packageName    : nds
 * fileName       : 문자열섞기
 * author         : ehdtka
 * date           : 2024-08-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-24        ehdtka       최초 생성
 */
public class 문자열섞기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String result = solution(str1, str2);
        System.out.printf(result);
    }

    public static String solution(String str1, String str2) {
        String answer = "";

        if (str1.length() < 1 || str1.length() != str2.length() || str2.length() > 10) {
            return "문자의 길이에 에러가 있습니다.";
        } else if (!str1.matches("^[a-z]+$") || !str2.matches("^[a-z]+$")) {
            return "문자는 알파벳 소문자만 가능합니다.";
        } else {
            for (int i = 0; i < str1.length(); i++) {
                answer += str1.substring(i, i+1);
                answer += str2.substring(i, i+1);
            }
            return answer;
        }
    }
}

// 다른 사람의 코드를 봤을 때 Springbuilder append를 많이 사용
