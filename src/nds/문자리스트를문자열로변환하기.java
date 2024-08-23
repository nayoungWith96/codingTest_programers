package nds;

import java.util.Scanner;

/**
 * packageName    : nds
 * fileName       : 문자리스트를문자열로변환하기
 * author         : ehdtka
 * date           : 2024-08-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-24        ehdtka       최초 생성
 */
public class 문자리스트를문자열로변환하기 {

    public static void main(String[] args) {

        String[] arr = {"a","b","c"};

        String result = solution(arr);

        System.out.printf(result);
    }

    public static String solution(String[] arr) {
        String answer = "";
        int i = 0;
        for (String str : arr) {
            i++;
            answer += str;
        }
        if (i < 1 || i > 200) {
            return "배열의 길이가 맞지않습니다.";
        } else if(!answer.matches("^[a-z]+$")) {
            return "알파벳 소문자만 가능합니다.";
        } else {
            return answer;
        }
    }
}

// 다른사람의 코드중에 String.join("", arr); 이런게 있더라..
