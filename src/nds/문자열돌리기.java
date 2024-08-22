package nds;

import java.util.Scanner;

/**
 * packageName    : nds
 * fileName       : 문자열돌리기
 * author         : ehdtka
 * date           : 2024-08-22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-22        ehdtka       최초 생성
 */
public class 문자열돌리기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        if (a.length() >= 1 && a.length() <= 10) {
            for (int i = 0; i < a.length(); i++) {
                System.out.println(a.substring(i, i+1));
            }
        }
    }
}
