package nds._20240829;

/**
 * packageName    : nds._20240829
 * fileName       : 등차수열의특정한항만더하기
 * author         : ehdtka
 * date           : 2024-08-29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-29        ehdtka       최초 생성
 */
public class 등차수열의특정한항만더하기 {

    public static void main(String[] args) {
        boolean[] included1 = {true,false,false,true,true};
        boolean[] included2 = {false,false,false,true,false, false, false};
        System.out.println(solution(3, 4, included1));
        System.out.println(solution(7, 1, included2));
    }

    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;

        if ((a >= 1 && a <= 100) && (d >= 1 && d <= 100) && (included.length >= 1 && included.length <= 100)) {

            for (boolean flag : included) {
                if (flag) {
                    answer += a;
                }
                a += d;
            }

        } else {
            System.out.println("제한 값을 확인 하세요");
            return 0;
        }

        return answer;
    }
}
// 1, 3, 5, 7 이런식으로 연속한 두 항의 차가 일정한 수열을 등차수열 이라고 한다.
// 연속한 두 항에서, 뒤 항에서 앞 항을 뺀 값을 공차 라고 한다.
