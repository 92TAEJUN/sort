
package app;

/*
선택 정렬(選擇整列, selection sort)은 제자리 정렬 알고리즘의 하나로, 다음과 같은 순서로 이루어진다.

1. 주어진 리스트 중에 최소값을 찾는다.
2. 그 값을 맨 앞에 위치한 값과 교체한다(패스(pass)).
3. 맨 처음 위치를 뺀 나머지 리스트를 같은 방법으로 교체한다.
비교하는 것이 상수 시간에 이루어진다는 가정 아래, n개의 주어진 리스트를 이와 같은 방법으로 정렬하는 데에는 Θ(n2) 만큼의 시간이 걸린다.

선택 정렬은 알고리즘이 단순하며 사용할 수 있는 메모리가 제한적인 경우에 사용시 성능 상의 이점이 있습니다.
*/

public class SelectionSort {
    public static void main(String[] args) throws Exception {
        // NumberBox
        int[] number = { 9, 1, 6, 8, 4, 3, 2, 0 };
        // indexMin : MinValueIndex , temp : MinValue
        int indexMin, temp = 0;

        for (int i = 0; i < number.length - 1; i++) {
            indexMin = i;
            for (int j = i + 1; j < number.length; j++) {
                if (number[j] < number[i]) {
                    indexMin = j;
                }
            }
            temp = number[indexMin];
            number[indexMin] = number[i];
            number[i] = temp;
        }
    }
}