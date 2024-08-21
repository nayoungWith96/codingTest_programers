package YNY;

import java.util.Scanner;

/**
 * packageName    : YNY
 * fileName       : 덧셈식출력하
 * author         : User
 * date           : 2024-08-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-21        User       최초 생성
 */
public class 덧셈식출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println(a + " + " + b + " = " + (a + b));

    }
}
