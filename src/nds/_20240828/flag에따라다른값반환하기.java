package nds._20240828;

/**
 * packageName    : nds._20240828
 * fileName       : flag에따라다른값반환하기
 * author         : ehdtka
 * date           : 2024-08-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-28        ehdtka       최초 생성
 */
public class flag에따라다른값반환하기 {

    public static void main(String[] args) {
        System.out.println(solution(-4, 7, true));
        System.out.println(solution(-4, 7, false));
    }

    public static int solution(int a, int b, boolean flag) {

        if ((a >= -1000 && a <= 1000) && (b >= -1000 && b <= 1000)) {

            return flag == true ? a + b : a - b;

        } else {
            System.out.println("정수는 -1000 ~ 1000");
            return 0;
        }

    }
}
