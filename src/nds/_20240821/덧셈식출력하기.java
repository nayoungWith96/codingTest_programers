package nds._20240821;

import java.util.Scanner;

/**
 * packageName    : nds
 * fileName       : 덧셈식출력하기
 * author         : ehdtka
 * date           : 2024-08-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-21        ehdtka       최초 생성
 */
public class 덧셈식출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if ((a >= 1 && a <= 100) &&  (b >= 1 && b <= 100)) {
            System.out.printf("%d + %d = %d" , a, b, a+b);
        } else {
            System.out.printf("1~100 사이의 수를 입력하세요");
        }
    }
}
