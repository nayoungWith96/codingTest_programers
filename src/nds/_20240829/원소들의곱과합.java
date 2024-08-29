package nds._20240829;

/**
 * packageName    : nds._20240829
 * fileName       : 원소들의곱과합
 * author         : ehdtka
 * date           : 2024-08-29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-29        ehdtka       최초 생성
 */
public class 원소들의곱과합 {

    public static void main(String[] args) {
        int[] arr1 = {3,4,5,2,1};
        int[] arr2 = {5,7,8,3};
        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
    }

    public static int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mul = 0;
        if (num_list.length >= 2 && num_list.length <= 10) {

            for (int num : num_list) {
                sum += num;

                if (mul == 0) {
                    mul = num;
                } else {
                    mul *= num;
                }
            }

        } else {
            System.out.printf("배열에 값 너무 많이 넣음");
        }

        System.out.println(mul);
        System.out.println(sum);

        return answer = mul < (sum*sum) ? 1 : 0;
    }
}
