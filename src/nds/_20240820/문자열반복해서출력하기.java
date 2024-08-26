package nds._20240820;

import java.util.Scanner;

/**
 * packageName    : nds
 * fileName       : 문자열반복해서출력하기
 * author         : ehdtka
 * date           : 2024-08-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-20        ehdtka       최초 생성
 */
public class 문자열반복해서출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        if ((str.length() >= 1 && str.length() <= 10) && (n >= 1 && n <= 5)) {
            for (int i = 0 ; n > i ; i++) {
                System.out.printf(str);
            }
        } else {
            System.out.printf("실패 (반복 될 수 나 글자 길이를 넘김)");
        }
    }
}
