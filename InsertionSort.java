
package app;

/*
삽입 정렬(揷入整列, insertion sort)은 자료 배열의 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하여, 자신의 위치를 찾아 삽입함으로써 정렬을 완성하는 알고리즘이다.
k번째 반복 후의 결과 배열은, 앞쪽 k + 1 항목이 정렬된 상태이다.
배열이 길어질수록 효율이 떨어진다. 다만, 구현이 간단하다는 장점이 있다.

선택 정렬이나 거품 정렬과 같은 같은 O(n2) 알고리즘에 비교하여 빠르며, 안정 정렬이고 in-place 알고리즘이다.

참고 및 관련 문헌
https://ko.wikipedia.org/wiki/%EC%82%BD%EC%9E%85_%EC%A0%95%EB%A0%AC
*/

public class InsertionSort {
    public static void main(String[] args) {
        // NumberBox
        int[] number = { 9, 1, 6, 8, 4, 3, 2, 0 };
        // temp : MinValue
        int temp = 0;

        for (int i = 0; i < number.length - 1; i++) {
            int j = i;
            while (j >= 0 && number[j + 1] < number[j]) {
                temp = number[j + 1];
                number[j + 1] = number[j];
                number[j] = temp;
                j--;
            }
        }
    }
}