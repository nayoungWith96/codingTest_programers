package nds;

import java.util.Scanner;

/**
 * packageName    : nds
 * fileName       : 문자열붙여서출력하기
 * author         : ehdtka
 * date           : 2024-08-22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-22        ehdtka       최초 생성
 */
public class 문자열붙여서출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        if ((a.length() >= 1 && a.length() <= 10) && b.length() >= 1 && b.length() <= 10) {
            String result = a+b;
            System.out.printf(result.trim());
        }
    }
}
