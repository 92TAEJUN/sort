
package app;

import java.util.Arrays;

/*
거품 정렬(Bubble sort)은 두 인접한 원소를 검사하여 정렬하는 방법이다. 시간 복잡도가 O(n^{2})로 상당히 느리지만, 코드가 단순하기 때문에 자주 사용된다. 원소의 이동이 거품이 수면으로 올라오는 듯한 모습을 보이기 때문에 지어진 이름이다.
n개의 주어진 리스트를 이와 같은 방법으로 정렬하는 데에는 Θ(n2) 만큼의 시간이 걸린다.

참고 및 관련 문헌
https://ko.wikipedia.org/wiki/%EA%B1%B0%ED%92%88_%EC%A0%95%EB%A0%AC
*/

public class BubbleSort {
    public static void main(String[] args) throws Exception {
        int[] array = { 4, 3, 2, 10, 5, 7, 9, 1, 6 };
        int cnt = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
                cnt++;
            }
            System.out.println(Arrays.toString(array) + " / " + cnt);
        }
    }
}