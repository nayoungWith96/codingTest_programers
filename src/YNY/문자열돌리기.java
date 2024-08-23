package YNY;

import java.util.Scanner;

/**
 * packageName    : YNY
 * fileName       : 문자열돌리
 * author         : User
 * date           : 2024-08-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-24        User       최초 생성
 */
public class 문자열돌리기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int n = a.length();
        for(int i=0; i<n; i++){
            System.out.println(a.charAt(i)); //문자열에서 문자의 순서를 나타내는 것
        }
    }
}
