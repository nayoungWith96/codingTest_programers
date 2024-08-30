package nds._20240830;

import java.util.HashMap;

/**
 * packageName    : nds._20240830
 * fileName       : 포켓몬뽑가ㅣ
 * author         : ehdtka
 * date           : 2024-08-30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-30        ehdtka       최초 생성
 */
public class 폰켓몬 {

    public static void main(String[] args) {

        int[] arr1 = {3,1,2,3};
        int[] arr2 = {3,3,3,2,2,4};
        int[] arr3 = {3,3,3,2,2,2};

        System.out.println(solution(arr1) + ": 1 case");
        System.out.println(solution(arr2) + ": 2 case");
        System.out.println(solution(arr3) + ": 3 case");
    }

    public static int solution(int[] nums) {

        HashMap map = new HashMap();
        int i = 0;
        for (int num : nums) {
            map.put(num,"");
            i++;
        }

        return map.size() > i/2 ? i/2 : map.size();
    }
}
