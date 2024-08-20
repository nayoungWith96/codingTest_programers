package YNY;

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
public class 문자열반복해서출력하기2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(str);
        }
    }
}
