package nds._20240822;

import java.util.Scanner;

/**
 * packageName    : nds
 * fileName       : 홀짝구분하기
 * author         : ehdtka
 * date           : 2024-08-22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-22        ehdtka       최초 생성
 */
public class 홀짝구분하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 1 && n <= 1000) {
            if (n % 2 == 0) {
                System.out.println(n + " is even");
            } else {
                System.out.println(n + " is odd");
            }
        }
    }
}
