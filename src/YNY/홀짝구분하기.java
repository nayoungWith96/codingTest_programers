package YNY;

import java.util.Scanner;

/**
 * packageName    : YNY
 * fileName       : 홀짝구분하기
 * author         : User
 * date           : 2024-08-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-24        User       최초 생성
 */
public class 홀짝구분하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println(n + " is even");
        }else{
            System.out.println(n + " is odd");
        }
        sc.close();
    }
}
