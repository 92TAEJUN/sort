
package app;

/*
퀵 정렬의 내부 루프는 대부분의 컴퓨터 아키텍처에서 효율적으로 작동하도록 설계되어 있고(그 이유는 메모리 참조가 지역화되어 있기 때문에 CPU 캐시의 히트율이 높아지기 때문이다.), 
대부분의 실질적인 데이터를 정렬할 때 제곱 시간이 걸릴 확률이 거의 없도록 알고리즘을 설계하는 것이 가능하다. 
또한 매 단계에서 적어도 1개의 원소가 자기 자리를 찾게 되므로 이후 정렬할 개수가 줄어든다. 때문에 일반적인 경우 퀵 정렬은 다른 O(n log n) 알고리즘에 비해 훨씬 빠르게 동작한다. 
이러한 이유로 퀵소트(빠른정렬)라는 이름의 기원이 되었다. 그리고 퀵 정렬은 정렬을 위해 O(log n)만큼의 memory를 필요로한다.

참고 및 관련 문헌
https://ko.wikipedia.org/wiki/%ED%80%B5_%EC%A0%95%EB%A0%AC
*/

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 8, 9, 2, 4, 6 };
        int left = 0;
        int right = 6;
        int i, j, pivot, tmp;
        if (left < right) {
            i = left;
            j = right;
            pivot = arr[(left + right) / 2];
            // 분할 과정
            while (i < j) {
                while (arr[j] > pivot)
                    j--;
                // 이 부분에서 arr[j-1]에 접근해서 익셉션 발생가능함.
                while (i < j && arr[i] < pivot)
                    i++;

                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
            // 정렬 과정
            quickSort(arr, left, i - 1);
            quickSort(arr, i + 1, right);
        }
    }
}