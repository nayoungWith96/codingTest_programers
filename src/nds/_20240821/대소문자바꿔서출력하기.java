package nds._20240821;

import java.util.Scanner;

/**
 * packageName    : nds
 * fileName       : 대소문자바꿔서출력하기
 * author         : ehdtka
 * date           : 2024-08-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-21        ehdtka       최초 생성
 */
public class 대소문자바꿔서출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        //if ((1 <= a.length() && 20 >= a.length()) && (Pattern.matches("^[a-zA-Z]*$", a))) {
            for (int i = 0; i < a.length(); i++) {
                char cStr = a.charAt(i);

                if (Character.isUpperCase(cStr)) {
                    result += Character.toLowerCase(cStr);
                } else {
                    result += Character.toUpperCase(cStr);
                }
            }
        //} else {
            //System.out.println("문자열 길이는 1~20 사이로 작성하고 알파벳만 작성 가능 합니다.");
            //return;
        //}

        System.out.printf(result);
    }
}
